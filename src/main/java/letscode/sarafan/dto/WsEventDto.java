package letscode.sarafan.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonView;
import javafx.event.EventType;
import letscode.sarafan.domain.Views;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.aspectj.apache.bcel.generic.ObjectType;

@Data
@AllArgsConstructor
@JsonView(Views.Id.class)
public class WsEventDto {
    private ObjectType objectType;
    private EventType eventType;
    @JsonRawValue
    private String body;

    public WsEventDto(letscode.sarafan.dto.ObjectType objectType,
                        letscode.sarafan.dto.EventType eventType,
                            String value) {

    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
