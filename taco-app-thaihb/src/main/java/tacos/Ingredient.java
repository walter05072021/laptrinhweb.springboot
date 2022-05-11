package tacos;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {
private final String id;
private final String name;
private final Type type;
public static enum Type {
WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
}

}
