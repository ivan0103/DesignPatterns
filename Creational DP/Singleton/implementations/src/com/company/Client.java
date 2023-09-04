package com.company;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry1 = EagerRegistry.getInstance();
		System.out.println(registry1.equals(registry));

		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazySingleton1.equals(lazyRegistry2));

		LazyRegistryIODH singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton1 = LazyRegistryIODH.getInstance();
		System.out.println(singleton.equals(singleton1));
	}
}
