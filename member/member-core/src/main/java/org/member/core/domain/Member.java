/**
 * packageName    : org.member.core.domain
 * fileName       : Member
 * author         : dani
 * date           : 2022/08/28
 * description    :
 */
package org.member.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    private String userId;

    @Lob
    private Blob password;

    private String name;

    private String email;

    private String phoneNum;

}
