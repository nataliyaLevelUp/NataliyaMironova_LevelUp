package homework_7.trelloboard.lists;

import lombok.Getter;

public class ListRequest {


    @Getter
    private String name;

    @Getter
    private String idBoard;


    public ListRequest(String name, String idBoard) {
        this.name = name;
        this.idBoard = idBoard;
    }



    @Override
    public String toString() {
        return "ListRequest{" +
                "name='" + name + '\'' +
                ", idBoard='" + idBoard + '\'' +
                '}';
    }


}
