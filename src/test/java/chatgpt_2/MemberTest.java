package chatgpt_2;

import model.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testMemberInitialization() {
        Member member = new Member(300, "Diana");
        assertEquals(300, member.getId());
        assertEquals("Diana", member.getName());
    }

    @Test
    void testToString() {
        Member member = new Member(301, "Edward");
        assertEquals("Edward", member.toString());
    }
}
