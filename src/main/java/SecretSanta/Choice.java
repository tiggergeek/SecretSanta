package SecretSanta;

public class Choice {

    public Choice(int playerId, int gameId) {
        this.playerId = playerId;
        this.gameId = gameId;

    }

    private int playerId;
    private String itemName;
    private String itemDesc;
    private int itemPrice;
    private String itemSource;
    private int gameId;

    public int getGameId() {
        return gameId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemSource() {
        return itemSource;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }


}
