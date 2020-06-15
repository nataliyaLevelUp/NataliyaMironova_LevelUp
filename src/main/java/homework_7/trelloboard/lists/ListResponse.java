package homework_7.trelloboard.lists;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListResponse {

    private String id;
    private String name;
    private String idBoard;
    private Integer pos;

    public ListResponse() {
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getIdBoard() {
        return idBoard;
    }


    public Integer getPos() {
        return pos;
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
