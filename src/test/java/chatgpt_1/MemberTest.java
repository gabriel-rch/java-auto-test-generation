package chatgpt_1;

import model.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    @Test
    public void testMemberConstructor() {
        Member member = new Member(1, "Alice");
        assertEquals(1, member.getId(), "O ID do membro deve estar correto.");
        assertEquals("Alice", member.getName(), "O nome do membro deve estar correto.");
    }

    @Test
    public void testToString() {
        Member member = new Member(2, "Bob");
        assertEquals("Bob", member.toString(), "O método toString deve retornar o nome do membro.");
    }
}
