package com.test;

public class StringEncoding {
    	public String encoding (String str) {

		StringBuilder strBuilder = new StringBuilder();

		int count = 1;
		char prev = str.charAt(0);

		for (int i=1; i<str.length(); i++) {
			char next = str.charAt(i);
			if (Character.isDigit(prev) || prev == '\\') {
		        strBuilder.append("\\");
		        strBuilder.append(prev);
		        prev = next;
		      }

			else if (prev==next) {
				count++;
			}

			else {
				strBuilder.append(count);
				strBuilder.append(prev);
				prev = next;
				count = 1;
			}
		}

		if (Character.isDigit(prev)) {
		      strBuilder.append("\\");
		    } else {
		      strBuilder.append(count);
		    }
		    strBuilder.append(prev);

		    return strBuilder.toString();

	}
}
