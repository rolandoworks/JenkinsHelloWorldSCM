package com.codebind;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****Hello World & Welcome to Jenkins Training*****");
		System.out.println("Being pulled from a Jenkins instance to be built and run");
		System.out.println("Added a github-webhook for Jenkins");
	}
	/***
	 * Run Project from outside of Jenkins
	 * JENKINS_URL/job/HelloWorld/build?token=TOKEN_NAME or /buildWithParameters?token=TOKEN_NAME
	 * http://192.241.159.67:8080/jenkins/job/HelloWorld/build?token=testing123
	 */

		
}
