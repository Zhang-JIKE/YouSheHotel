package core.model;

public class House {

    private long hid; // house_id

    private String title; // 标题，eg:精装大床房
    private String description; // 描述
    private String location; // 地址，eg:3-0-7

    private float deposit; // 押金
    private float price; // 金额

    private String size; // 面积，eg:20平
    private String capacity; // 容量，eg:可住2人
    private String bedInfo; // 床型，eg:2米大床

    private int type; // 户型，0:大床房 1:双床房 2:....
    private String[] tags; // 标签，eg:含早晚 独卫 空调 洗衣机
    private String[] imageURL; // 图片地址
    private String videoURL; // 视频地址
}
