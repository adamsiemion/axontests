import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import javax.annotation.Generated;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class RedeemCmd {
    @TargetAggregateIdentifier // (1)
    private final String id;
    private final Integer amount;
}