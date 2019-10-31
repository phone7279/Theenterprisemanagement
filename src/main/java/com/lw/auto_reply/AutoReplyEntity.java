package com.lw.auto_reply;

import javax.persistence.*;

@Entity
@Table(name = "auto_reply", schema = "test")
public class AutoReplyEntity {
    private int id;
    private String mReceive;
    private String mSend;

    public AutoReplyEntity() {
    }

    public AutoReplyEntity(int id, String mReceive, String mSend) {
        this.id = id;
        this.mReceive = mReceive;
        this.mSend = mSend;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "m_receive")
    public String getmReceive() {
        return mReceive;
    }

    public void setmReceive(String mReceive) {
        this.mReceive = mReceive;
    }

    @Basic
    @Column(name = "m_send")
    public String getmSend() {
        return mSend;
    }

    public void setmSend(String mSend) {
        this.mSend = mSend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoReplyEntity that = (AutoReplyEntity) o;

        if (id != that.id) return false;
        if (mReceive != null ? !mReceive.equals(that.mReceive) : that.mReceive != null) return false;
        if (mSend != null ? !mSend.equals(that.mSend) : that.mSend != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mReceive != null ? mReceive.hashCode() : 0);
        result = 31 * result + (mSend != null ? mSend.hashCode() : 0);
        return result;
    }



}
