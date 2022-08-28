/**
 * packageName    : org.member.core.domain
 * fileName       : Grade
 * author         : dani
 * date           : 2022/08/28
 * description    :
 */
package org.member.core.domain;

import org.member.core.common.enums.TypeEnum;

import javax.persistence.*;

@Entity
public class MemberGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    private String gradeName;

    @Enumerated(EnumType.STRING)
    private TypeEnum.isUse isUse;

    private Integer displayOrder;
}
