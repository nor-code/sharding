package com.example.shard.repo;

import com.example.shard.model.entity.UserInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface UserRepositoryJpa extends JpaRepository<UserInfo, Long> {

    /**
     * time belong [begin, end]
     * @param begin
     * @param end
     * @return
     */
    List<UserInfo> findUserInfosByTimeOperationAfterAndTimeOperationBefore(LocalDateTime begin, LocalDateTime end, Pageable pageable);
}
