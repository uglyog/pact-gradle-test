//package com.github.uglyog.pactgradletest;
//
//import au.com.dius.pact.provider.PactVerifyProvider;
//
//public class MessageTest {
//  @PactVerifyProvider("a hello message")
//  public String helloMessage() {
//    System.out.println(">>> Hello");
//    return "\"Hello\"";
//  }
//}

/*
Verifying a pact between MIRB and IPS
  [Using File /Users/malinda/Code/ips-microservice-vehicle-txn/src/test/resources/pacts/MIRB-IPS.json]
  Given transactions are processed
         WARNING: State Change ignored as there is no stateChange URL
  a processed transaction
      Verification Failed - No signature of method: au.com.dius.pact.provider.ProviderVerifier.invokeProviderMethod() is applicable for argument types: (java.lang.reflect.Method) values: [public java.lang.String net.nxbos.ips.vehicletxn.resource.VehicleTxnResourcePactTest.verifyTransaction()]
Possible solutions: invokeProviderMethod(java.lang.reflect.Method, java.lang.Object)
groovy.lang.MissingMethodException: No signature of method: au.com.dius.pact.provider.ProviderVerifier.invokeProviderMethod() is applicable for argument types: (java.lang.reflect.Method) values: [public java.lang.String net.nxbos.ips.vehicletxn.resource.VehicleTxnResourcePactTest.verifyTransaction()]
Possible solutions: invokeProviderMethod(java.lang.reflect.Method, java.lang.Object)
	at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.unwrap(ScriptBytecodeAdapter.java:58)
	at org.codehaus.groovy.vmplugin.v7.IndyGuardsFiltersAndSignatures.unwrap(IndyGuardsFiltersAndSignatures.java:177)
	at org.codehaus.groovy.vmplugin.v7.IndyInterface.selectMethod(IndyInterface.java:232)
	at au.com.dius.pact.provider.ProviderVerifier$_verifyResponseByInvokingProviderMethods_closure28.doCall(ProviderVerifier.groovy:324)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:294)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.Closure.call(Closure.java:414)
	at groovy.lang.Closure.call(Closure.java:430)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2040)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2025)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2078)
	at org.codehaus.groovy.runtime.dgm$165.doMethodInvoke(Unknown Source)
	at org.codehaus.groovy.vmplugin.v7.IndyInterface.selectMethod(IndyInterface.java:232)
	at au.com.dius.pact.provider.ProviderVerifier.verifyResponseByInvokingProviderMethods(ProviderVerifier.groovy:323)
	at org.codehaus.groovy.vmplugin.v7.IndyInterface.selectMethod(IndyInterface.java:232)
	at au.com.dius.pact.provider.ProviderVerifier.verifyInteraction(ProviderVerifier.groovy:188)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1213)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1080)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1087)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.Closure.call(Closure.java:414)
	at groovy.lang.Closure.call(Closure.java:430)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.collect(DefaultGroovyMethods.java:3202)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.collect(DefaultGroovyMethods.java:3172)
	at au.com.dius.pact.provider.ProviderVerifier.runVerificationForConsumer(ProviderVerifier.groovy:85)
	at au.com.dius.pact.provider.ProviderVerifier.runVerificationForConsumer(ProviderVerifier.groovy)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1213)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1080)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1087)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1022)
	at groovy.lang.Closure.call(Closure.java:414)
	at groovy.lang.Closure.call(Closure.java:430)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2040)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2025)
	at org.codehaus.groovy.runtime.DefaultGroovyMethods.each(DefaultGroovyMethods.java:2066)
	at org.codehaus.groovy.runtime.dgm$163.doMethodInvoke(Unknown Source)
	at org.codehaus.groovy.vmplugin.v7.IndyInterface.selectMethod(IndyInterface.java:232)
	at au.com.dius.pact.provider.ProviderVerifier.verifyProvider(ProviderVerifier.groovy:61)
	at au.com.dius.pact.provider.maven.PactProviderMojo.execute(PactProviderMojo.kt:86)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:154)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:146)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:290)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:194)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[WARNING] Skipping publishing of verification results as it has been disabled (pact.verifier.publishResults is not 'true')

Failures:

0) Verifying a pact between MIRB and IPS - a processed transaction  Given transactions are processed
      No signature of method: au.com.dius.pact.provider.ProviderVerifier.invokeProviderMethod() is applicable for argument types: (java.lang.reflect.Method) values: [public java.lang.String net.nxbos.ips.vehicletxn.resource.VehicleTxnResourcePactTest.verifyTransaction()]
      Possible solutions: invokeProviderMethod(java.lang.reflect.Method, java.lang.Object)
 */