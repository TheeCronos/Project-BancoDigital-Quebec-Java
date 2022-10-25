import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Getter @Setter private String nome;
    @Getter @Setter private String cpf;
    @Getter @Setter private String email;
    @Getter @Setter private int numero;

}
