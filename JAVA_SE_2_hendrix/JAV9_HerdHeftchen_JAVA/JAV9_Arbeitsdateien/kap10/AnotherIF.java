package com.herdt.java9.kap10;

public interface AnotherIF
{
	public default String saySomething()
	{
		return "Hallo aus dem Interface AnotherIF";
	}
}