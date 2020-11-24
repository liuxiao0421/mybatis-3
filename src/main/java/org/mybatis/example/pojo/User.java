package org.mybatis.example.pojo;

/**
 * @Description: TODO
 * @ClassName: User
 * @Author: liu xiao
 * @Date: 2020/11/24 4:40 下午
 **/
public class User {
  private Integer id;
  private String lfPartyId;
  private String partyName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLfPartyId() {
    return lfPartyId;
  }

  public void setLfPartyId(String lfPartyId) {
    this.lfPartyId = lfPartyId;
  }

  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }
}
