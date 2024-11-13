import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
    }
    public static List<String> krupnyeKlienty (Map<String,BankAccount> map){
        Comparator<Map.Entry<String, BankAccount>> comparatorByBalance = (e1, e2) -> Double.compare(e1.getValue().getBalance(), e2.getValue().getBalance());
        return map.entrySet().stream()
                .sorted(comparatorByBalance.reversed())
                .limit(3)
                .map(e-> e.getValue().getOwner().getfName() + " " + e.getValue().getOwner().getlName())
                .collect(Collectors.toList());
    }
}