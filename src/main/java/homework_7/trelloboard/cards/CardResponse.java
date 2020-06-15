package homework_7.trelloboard.cards;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardResponse {

    @Getter
    private String id;

    @Getter
    private String name;

    @Getter
    private String desc;

    @Getter
    private String idList;

    @Getter
    private String idBoard;

    public CardResponse() {
    }

    @Override
    public String toString() {
        return "CardResponse{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", idList='" + idList + '\'' +
                ", idBoard='" +idBoard + '\'' +
                ", name='" +name + '\'' +
                '}';
    }





}
