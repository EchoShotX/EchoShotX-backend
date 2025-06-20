package com.echoshotx.domain.member.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
        name = "member",
        indexes = {
                @Index(name = "idx_member_username", columnList = "username"),
                @Index(name = "idx_member_nickname", columnList = "nickname"),
        }
)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false, unique = true)
    private String username;

    private String email;

    private int token;

    //business logic
    //todo implement exception handler
    public void useToken(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Token amount must be greater than zero.");
        }
        if (this.token < amount) {
            throw new IllegalStateException("Insufficient token balance.");
        }
        this.token -= amount;
    }

}
