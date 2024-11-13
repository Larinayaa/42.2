import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
class TestVIP {
    @Test
    @DisplayName("VIP")
     void test_3_bogatychKlienta() {
        Map<String, BankAccount> map = Map.of(
                "oleg111@gmail.com",new BankAccount( new Person("Олег","Ольховский", "oleg111@gmail.com"), "DE65436",5000.29),
                "dmitriymuller@gmail.com", new BankAccount(new Person("Дмитрий","Миллер", "dmitriymuller@gmail.com"), "DE75688",1872.60),
                "annamuller@gmail.com",new BankAccount(new Person("Анна","Мюллер", "annamuller@gmail.com"), "DE95483",13452.45),
                "nickitanem@gmail.com",new BankAccount(new Person("Никита","Немцев", "nickitanem@gmail.com"), "DE02345",45.25),
                "michailtrutnew@gmail.com",new BankAccount(new Person("Михаил","Трутнев", "michailtrutnew@gmail.com"), "DE55532",100324.50),
                "danikgrus@gmail.com",new BankAccount( new Person("Данил","Грушевский", "danikgrus@gmail.com"), "DE10539",828.15)
        );
        List<String> expected = List.of(
                "Михаил Трутнев",
                "Анна Мюллер",
                "Олег Ольховский"
        );
        List<String> actual = Main.krupnyeKlienty(map);
        Assertions.assertIterableEquals(expected,actual);
    }
}
