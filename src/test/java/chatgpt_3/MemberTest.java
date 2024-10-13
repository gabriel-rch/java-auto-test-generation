package chatgpt_3;

import model.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    @DisplayName("Criar Membro e Verificar Atributos")
    void testMemberCreation() {
        Member member = new Member(1, "Carlos Silva");
        assertEquals(1, member.getId());
        assertEquals("Carlos Silva", member.getName());
    }

    @Test
    @DisplayName("Representação em String do Membro")
    void testToString() {
        Member member = new Member(2, "Ana Pereira");
        assertEquals("Ana Pereira", member.toString());
    }
}
