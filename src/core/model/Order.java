package core.model;

public class Order {
    private long oid; // order_id
    private long uid; // 预订客人id
    private long time; // 下单时间

    private String phonenum; // 预订预留手机号
    private String realName; // 真实姓名
    private String IDNumber; // 身份证号码

    private long startTime; // 预订到店时间
    private long endTime; // 预订退房时间

    private int houseType; // 预订房型

    private boolean isPayed; // 是否完成支付
    private String tradeId; // 微信、支付宝交易id
    private String tradeTime; // 交易时间
    private float amount; // 支付金额
}
