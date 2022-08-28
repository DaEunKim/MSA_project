/**
 * packageName    : org.member.core.repository
 * fileName       : GradeRepository
 * author         : dani
 * date           : 2022/08/28
 * description    :
 */
package org.member.core.repository;

import org.member.core.domain.MemberGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<MemberGrade, Long> {
}
