package com.springcore.collections;

public class Properties {
	private String name;
	private String channelName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	@Override
	public String toString() {
		return "Properties [name=" + name + ", channelName=" + channelName + "]";
	}
	
}
