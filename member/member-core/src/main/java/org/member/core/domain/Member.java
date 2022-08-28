/**
 * packageName    : org.member.core.domain
 * fileName       : Member
 * author         : dani
 * date           : 2022/08/28
 * description    :
 */
package org.member.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    private String userId;

    private String name;

    private String email;

}
