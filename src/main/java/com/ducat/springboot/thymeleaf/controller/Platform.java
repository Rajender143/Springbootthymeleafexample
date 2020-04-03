package com.ducat.springboot.thymeleaf.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties
public class Platform {

	private ServiceHost serviceHost = new ServiceHost();
	
	@Data
	public class ServiceHost {
		
		private Connection connection = new Connection();
		
		@Data
		public class Connection {
			private String connectTimeoutInMins;
			private String readTimeoutInMins;
		}

		
		private Security security = new Security();
		
		@Data
		public class Security {
			private String username;
			private String password;
		}
		private String benefitfacade;
		private String memberfacade;
		private String providerfacade;
		private String claimfacade;
		private String authfacade;
		private String utilfacade;
		private String referralfacade;
		private String cvafacade;
		private String ssofacade;
		private String pingSSOServer;
	}

	private Cache cache = new Cache();
	
	@Data
	public class Cache {
		
		private ScheduledClearance scheduledClearance = new ScheduledClearance();
		
		@Data
		public class ScheduledClearance {
			private String intervalInMilliSeconds;
			private String initialDelayInMilliSeconds;
		}
		
		
	}
	
	private PingAdapters pingAdapters = new PingAdapters();
	private PingConfigProperties pingConfigProperties= new PingConfigProperties();
	
	@Data
	public class PingConfigProperties {
		private String pingSSOServer;
		private PingAdapters pingAdapters = new PingAdapters();
	}
	
	@Data
	public class PingAdapters {
		private HealthEquityAdapter healthEquityAdapter = new HealthEquityAdapter();
		
		@Data
		public class HealthEquityAdapter {
			private String spId;
			private String instanceId;
			private String user;
			private String pwd;
		}
	}
	
	private EncryptDecrypt encryptDecrypt =new EncryptDecrypt();
	@Data
	public class EncryptDecrypt {
			private String requireEncryptionDecryption;
			private String requireUserIdFlag;
			private String numberOfBytesPrivatekey;
			private String defaultPrivateKey;
		}
	
	private CredentialsEat credentialsEat=new CredentialsEat();
	@Data
	public class CredentialsEat{
		private String username;
		private String password;
	}

	private IPerception iPerception=new IPerception();
	@Data
	public class IPerception{
		private boolean enabled;
		private String script;
	}
	
	private DeactivateDate deactivateDate=new DeactivateDate();
	@Data
	public class DeactivateDate{
		private String manageUserDate;
	}
	
private DomainUrl domainUrl = new DomainUrl();
	
	@Data
	public class DomainUrl {
		private String baseUrl;
	}

}
