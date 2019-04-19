package com.cloud.controller.observer.test;

/***
 * 抽象被观察者接口 声明了添加、删除、通知观察者方法
 *
 */
public interface ObserverAble {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
