package com.springTest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springTest.Entity.Test;

public interface TestRepo extends JpaRepository<Test, Integer> {

}
