package com.example.demo.Repository;

import com.example.demo.pojos.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository <Event,Long>{

}
