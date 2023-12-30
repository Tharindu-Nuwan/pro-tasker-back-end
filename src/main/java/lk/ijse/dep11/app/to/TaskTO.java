package lk.ijse.dep11.app.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.groups.Default;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskTO implements Serializable {
    @Null(message = "ID should be empty")
    private Integer id;

    @NotBlank(message = "Description can't be empty")
    private String description;

    @Null(message = "Status should be empty", groups = Create.class)
    @NotNull(message = "Status shouldn't be empty", groups = Update.class)
    private Boolean status;

    @NotBlank(message = "Email can't be empty")
    @Email
    private String email;

    public interface Update extends Default {}
    public interface Create extends Default {}
}
