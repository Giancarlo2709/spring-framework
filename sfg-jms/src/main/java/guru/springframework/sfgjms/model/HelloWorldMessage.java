package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Class <b>HelloWorldMessage</b>.
 * @author Giancarlo
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

  static final long serialVersionUID = 6701657317502492251L;

  private UUID id;
  private String message;
}
