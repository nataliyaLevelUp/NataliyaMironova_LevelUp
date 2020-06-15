package homework_7.trelloboard.lists;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListResponse {

    @Getter
    private String id;

    @Getter
    private String name;

    @Getter
    private String idBoard;

    @Getter
    private Integer pos;

    public ListResponse() {
    }


    @Override
    public String toString() {
        return "ListResponse{" +
                "id='" + id + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", name='" + name + '\'' +
                ", pos='" + pos + '\'' +
                '}';
    }


















}
