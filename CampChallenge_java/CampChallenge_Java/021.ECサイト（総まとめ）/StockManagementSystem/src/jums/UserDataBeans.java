package jums;

import java.io.Serializable;

/**
 * ページで入出力されるユーザー情報を持ちまわるJavaBeans。DTOと違い画面表示系への結びつきが強い
 * DTOへの変換メソッド、入力チェックリストを出力するメソッドも準備されている←ちょっと仕事しすぎかも
 * @author hayashi-s
 */
public class UserDataBeans implements Serializable{
    private String id;
    private String pass;


    public UserDataBeans(){
    }

    public String getId() {
    	return this.id;
    }

    public void setId(String id) {
    	this.id = id;
    }

    public String getPass() {
    	return this.pass;
    }

    public void setPass(String pass) {
    	this.pass = pass;
    }
}