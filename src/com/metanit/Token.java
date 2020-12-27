package com.metanit;

public class Token {
    private final TokenType TType;
    private final String Text;
    int index,matched;
    public Token(TokenType TType,String Text,int index,int matched) {
        this.TType = TType;
        this.Text = Text;
        this.index = index;
        this.matched = matched;
    }
    public TokenType getTType() {
        return TType;
    }

    public String getText() {
        return Text;
    }

    public int getIndex() {
        return index;
    }
    public int getMatched() {
        return matched;
    }

    @Override
    public String toString() {
        return " " + TType + " | '" + Text + "' \n" + " ---------------------- " + " \n";
    }
}

