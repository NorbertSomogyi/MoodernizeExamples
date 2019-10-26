package application;

public class imap_socket {
	private Object fd;
	private Object ssl;
	
	public imap_socket(Object fd, Object ssl) {
		setFd(fd);
		setSsl(ssl);
	}
	public imap_socket() {
	}
	
	public void socket_perror(Object func, int ret) {
		Object generatedSsl = this.getSsl();
		if (generatedSsl) {
			int sslerr = .SSL_get_error(generatedSsl, ret);
			switch (sslerr) {
			case SSL_ERROR_SYSCALL:
					.perror("SSL_connect");
					break;
			case SSL_ERROR_NONE:
					break;
			default:
					ModernizedCProgram.ssl_socket_perror("SSL_connect");
					break;
			}
		} else {
				if (ret < 0) {
					.perror(func);
				} else {
						.fprintf((_iob[2]), "%s: unexpected EOF\n", func);
				} 
		} 
	}
	public int ssl_socket_connect(int use_tls_only, int verify) {
		 meth = new ();
		 ctx = new ();
		int ret;
		 cert = new ();
		.SSL_library_init();
		.SSL_load_error_strings();
		meth = .SSLv23_method();
		if (!meth) {
			ModernizedCProgram.ssl_socket_perror("SSLv23_method");
			return -1;
		} 
		ctx = .SSL_CTX_new(meth);
		if (!ctx) {
			ModernizedCProgram.ssl_socket_perror("SSL_CTX_new");
			return -1;
		} 
		if (use_tls_only) {
			.SSL_CTX_set_options(ctx, SSL_OP_NO_SSLv2 | SSL_OP_NO_SSLv3);
		} 
		if (verify) {
			.SSL_CTX_set_verify(ctx, SSL_VERIFY_PEER, ((Object)0));
		} 
		if (!.SSL_CTX_set_default_verify_paths(ctx)) {
			ModernizedCProgram.ssl_socket_perror("SSL_CTX_set_default_verify_paths");
			return -1;
		} 
		this.setSsl(.SSL_new(ctx));
		Object generatedSsl = this.getSsl();
		if (!generatedSsl) {
			ModernizedCProgram.ssl_socket_perror("SSL_new");
			return -1;
		} 
		Object generatedFd = this.getFd();
		if (!.SSL_set_rfd(generatedSsl, generatedFd[0])) {
			ModernizedCProgram.ssl_socket_perror("SSL_set_rfd");
			return -1;
		} 
		if (!.SSL_set_wfd(generatedSsl, generatedFd[1])) {
			ModernizedCProgram.ssl_socket_perror("SSL_set_wfd");
			return -1/*
				 * SNI (RFC4366)
				 * OpenSSL does not document this function, but the implementation
				 * returns 1 on success, 0 on failure after calling SSLerr().
				 */;
		} 
		ret = .SSL_connect(generatedSsl);
		if (ret <= 0) {
			sock.socket_perror("SSL_connect", ret);
			return -1;
		} 
		if (verify) {
			cert = .SSL_get_peer_certificate(generatedSsl);
			if (!cert) {
				return ();
			} 
			if (ModernizedCProgram.verify_hostname(cert, ModernizedCProgram.server.getHost()) < 0) {
				return -1;
			} 
		} 
		return 0;
	}
	public int socket_read(Byte buf, int len) {
		ssize_t n = new ssize_t();
		Object generatedSsl = this.getSsl();
		Object generatedFd = this.getFd();
		if (generatedSsl) {
			n = .SSL_read(generatedSsl, buf, len);
		} else {
				n = ModernizedCProgram.xread(generatedFd[0], buf, len);
		} 
		if (n <= 0) {
			sock.socket_perror("read", n);
			.close(generatedFd[0]);
			.close(generatedFd[1]);
			generatedFd[0] = generatedFd[1] = -1;
		} 
		return n;
	}
	public int socket_write(Object buf, int len) {
		int n;
		Object generatedSsl = this.getSsl();
		Object generatedFd = this.getFd();
		if (generatedSsl) {
			n = .SSL_write(generatedSsl, buf, len);
		} else {
				n = ModernizedCProgram.write_in_full(generatedFd[1], buf, len);
		} 
		if (n != len) {
			sock.socket_perror("write", n);
			.close(generatedFd[0]);
			.close(generatedFd[1]);
			generatedFd[0] = generatedFd[1] = -1;
		} 
		return n;
	}
	public void socket_shutdown() {
		Object generatedSsl = this.getSsl();
		if (generatedSsl) {
			.SSL_shutdown(generatedSsl);
			.SSL_free(generatedSsl);
		} 
		Object generatedFd = this.getFd();
		.close(generatedFd[0]);
		.close(generatedFd[1]);
	}
	public Object getFd() {
		return fd;
	}
	public void setFd(Object newFd) {
		fd = newFd;
	}
	public Object getSsl() {
		return ssl;
	}
	public void setSsl(Object newSsl) {
		ssl = newSsl;
	}
}
