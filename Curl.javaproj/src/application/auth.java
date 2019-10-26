package application;

/* last in list */
/*
 * Values that are generated, temporary or calculated internally for a
 * "session handle" must be defined within the 'struct UrlState'.  This struct
 * will be used within the Curl_easy struct. When the 'Curl_easy'
 * struct is cloned, this data MUST NOT be copied.
 *
 * Remember that any "state" information goes globally for the curl handle.
 * Session-data MUST be put in the connectdata struct and here.  */
/* auth details for host */
/* auth details for proxy */
public class auth {
	private long want;
	private long picked;
	private long avail;
	private Object done;
	private Object multipass;
	private Object iestyle;
	
	public auth(long want, long picked, long avail, Object done, Object multipass, Object iestyle) {
		setWant(want);
		setPicked(picked);
		setAvail(avail);
		setDone(done);
		setMultipass(multipass);
		setIestyle(iestyle);
	}
	public auth() {
	}
	
	public  pickoneauth(long mask) {
		bool picked = new bool();
		long generatedAvail = this.getAvail();
		long generatedWant = this.getWant();
		long avail = generatedAvail & generatedWant & /* only deal with authentication we want */mask;
		picked = 1;
		if (avail & /* The order of these checks is highly relevant, as this will be the order
		     of preference in case of the existence of multiple accepted types. */CURLAUTH_NEGOTIATE) {
			this.setPicked(CURLAUTH_NEGOTIATE);
		}  else if (avail & CURLAUTH_BEARER) {
			this.setPicked(CURLAUTH_BEARER);
		}  else if (avail & CURLAUTH_DIGEST) {
			this.setPicked(CURLAUTH_DIGEST);
		}  else if (avail & CURLAUTH_NTLM) {
			this.setPicked(CURLAUTH_NTLM);
		}  else if (avail & CURLAUTH_NTLM_WB) {
			this.setPicked(CURLAUTH_NTLM_WB);
		}  else if (avail & CURLAUTH_BASIC) {
			this.setPicked(CURLAUTH_BASIC);
		} else {
				this.setPicked((1 << /* we select to use nothing */30));
				picked = 0;
		} 
		this.setAvail(/* clear it here */CURLAUTH_NONE);
		return picked/*
		 * http_perhapsrewind()
		 *
		 * If we are doing POST or PUT {
		 *   If we have more data to send {
		 *     If we are doing NTLM {
		 *       Keep sending since we must not disconnect
		 *     }
		 *     else {
		 *       If there is more than just a little data left to send, close
		 *       the current connection by force.
		 *     }
		 *   }
		 *   If we have sent any data {
		 *     If we don't have track of all the data {
		 *       call app to tell it to rewind
		 *     }
		 *     else {
		 *       rewind internally so that the operation can restart fine
		 *     }
		 *   }
		 * }
		 */;
	}
	public long getWant() {
		return want;
	}
	public void setWant(long newWant) {
		want = newWant;
	}
	public long getPicked() {
		return picked;
	}
	public void setPicked(long newPicked) {
		picked = newPicked;
	}
	public long getAvail() {
		return avail;
	}
	public void setAvail(long newAvail) {
		avail = newAvail;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
	public Object getMultipass() {
		return multipass;
	}
	public void setMultipass(Object newMultipass) {
		multipass = newMultipass;
	}
	public Object getIestyle() {
		return iestyle;
	}
	public void setIestyle(Object newIestyle) {
		iestyle = newIestyle;
	}
}
