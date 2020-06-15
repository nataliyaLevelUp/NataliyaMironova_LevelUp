package homework_7.trelloboard.boards;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardResponse {

    private String id;

    public BoardResponse() {

    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BoardResponse{" +
                "id='" + id + '\'' + '}';

    }














}
