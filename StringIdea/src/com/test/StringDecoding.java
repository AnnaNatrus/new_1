package com.test;

public class StringDecoding {
    public String decoding (String stri) {

	StringBuilder strBuild = new StringBuilder();

	int count = 0;
	int k = stri.indexOf("\\");

    for (int i = 0; i < k; i++) {
        char ind = stri.charAt(i);

        	if (Character.isDigit(ind)) {
        		count = ind - '0' ;
        	}
        	else {
        		while (count >0 ){
        			strBuild.append(ind);
        			count--;
        	}
        }
    }

    for (int j = k + 1; j < stri.length()-1; j++) {
        char ind = stri.charAt(j);
        char inde = stri.charAt(j+1);

        	if (ind == '\\' && Character.isDigit(inde)) {
        		strBuild.append(inde);
        	}
        	else if (ind == '\\' && inde == '\\' ) {
        		strBuild.append(inde);
        	}
	}  return strBuild.toString();

  }
}
