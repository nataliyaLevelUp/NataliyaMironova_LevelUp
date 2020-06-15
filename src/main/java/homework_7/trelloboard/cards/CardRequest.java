package homework_7.trelloboard.cards;

import lombok.Getter;

public class CardRequest {

    @Getter
    private String name;

    @Getter
    private String desc;

    @Getter
    private String idList;

    @Getter
    private String idMembers;


    public CardRequest(String name, String desc, String idList, String idMembers) {
        this.name = name;
        this.desc = desc;
        this.idList = idList;
        this.idMembers = idMembers;
    }

    @Override
    public String toString() {
        return "CardRequest{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", idList='" + idList + '\'' +
                ", idMembers='" +idMembers + '\'' +
                '}';
    }

}
