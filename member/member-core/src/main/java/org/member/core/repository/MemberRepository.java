/**
 * packageName    : org.member.core.repository
 * fileName       : MemberRepository
 * author         : dani
 * date           : 2022/08/28
 * description    :
 */
package org.member.core.repository;

import org.member.core.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
