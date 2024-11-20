package com.college.service;


import com.college.entity.College;
import com.college.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class service
{
    @Autowired
    private CollegeRepository repo;

    public College saveCollege(College college)
    {
       return repo.save(college);
    }

    public List<College> findAll()
    {
        return repo.findAll();
    }

    public College findById(int cid)
    {
        Optional<College> clg = repo.findById(cid);

        if(clg.isEmpty())
        {
            throw new RuntimeException("College id not found");
        }
        return clg.get();
    }

    public College collegeUpdate(College college)
    {
       Optional<College> clg = repo.findById(college.getCid());
       if(clg.isEmpty())
       {
           throw new RuntimeException("College not found");
       }
       College existingCollege = clg.get();
        existingCollege.setCollegeName(college.getCollegeName());
        existingCollege.setCollegeLocation(college.getCollegeLocation());
        existingCollege.setCollegeDept(college.getCollegeDept());

        return repo.save(existingCollege);
    }

    public void deleteCollege(int cid) {
        Optional<College> clg = repo.findById(cid);

        if (clg.isEmpty()) {
            throw new RuntimeException("College not found");
        }

        repo.delete(clg.get());
    }



}
