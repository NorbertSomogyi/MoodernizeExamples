package application;

public class MainToRaptor_serializer_start_to_file_handle {
	
	
	public static int main(int argc, byte[][] argv) {
		flickcurl fc = (null);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int cmd_index = -1;
		int read_auth = 1;
		int i;
		int request_delay = -1;
		byte[] command = (null);
		ModernizedCProgram.output_fh = (_iob[1]);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, (null));
		if (read_auth) {
			if (!/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
				if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
					rc = 1;
					;
				} 
			} else {
					for (i = 0; i < argc; ++/* Check if the user has requested to see the help message */i) {
						if (!/*Error: Function owner not recognized*/strcmp(argv[i], "-h") || !/*Error: Function owner not recognized*/strcmp(argv[i], "--help")) {
							ModernizedCProgram.print_help_string();
						} 
					}
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Configuration file %s not found.\n\n1. Visit http://www.flickr.com/services/api/keys/ to get an <API Key>\n    and <Shared Secret>.\n\n2. Create %s in this format:\n[flickr]\noauth_client_key=<Client key / API Key>\noauth_client_secret=<Client secret / Shared Secret>\n\n3. Call this program with:\n  %s oauth.create\n  (or %s oauth.create <Callback URL> if you understand and need that)\nThis gives a <Request Token> <Request Token Secret> and <Authentication URL>\n\n4. Visit the <Authentication URL> and approve the request to get a <Verifier>\n\n5. Call this program with the <Request Token>, <Request Token Secret>\n    and <Verifier>:\n  %s oauth.verify <Request Token> <Request Token Secret> <Verifier>\n\nThis will write the configuration file with the OAuth access tokens.\nSee http://librdf.org/flickcurl/api/flickcurl-auth.html for full instructions.\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.program, ModernizedCProgram.program, ModernizedCProgram.program);
					rc = 1;
					;
			} 
		} 
		while (!usage && !help) {
			int c;
			Byte auth_token = (null);
			c = ModernizedCProgram.getopt(argc, argv, "a:d:ho:qvV");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case (byte)'V':
					ModernizedCProgram.verbose = 2;
					break;
			case (byte)'a':
					auth_token = fc.flickcurl_auth_getFullToken(/* Exchange the frob for a full token */ModernizedCProgram.optarg);
					if (!auth_token) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Could not find auth_token in getFullToken response\n", ModernizedCProgram.program);
						rc = 1;
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Successfully exchanged frob %s for authentication token\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
							fc.flickcurl_set_auth_token(auth_token);
							rc = fc.flickcurl_config_write_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section);
							if (!rc) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "%s: Updated configuration file %s with authentication token\n", ModernizedCProgram.program, ModernizedCProgram.flickcurl_cmdline_config_path);
							} 
					} 
					;
			case (byte)'q':
					ModernizedCProgram.verbose = 0;
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'h':
					help = 1;
					break;
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						ModernizedCProgram.output_filename = ModernizedCProgram.optarg;
						ModernizedCProgram.output_fh = /*Error: Function owner not recognized*/fopen(ModernizedCProgram.output_filename, "w");
						if (!ModernizedCProgram.output_fh) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to write to output file %s: %s\n", ModernizedCProgram.program, ModernizedCProgram.output_filename, /*Error: Function owner not recognized*/strerror(errno));
							rc = 1;
							;
						} 
					} 
					break;
			case 0:
			}
		}
		argv += ModernizedCProgram.optind;
		argc -= ModernizedCProgram.optind;
		if (!help && !argc) {
			usage = /* Title and usage */2;
			;
		} 
		if (usage || help) {
			;
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		command = argv[0];
		for (i = 0; command[i]; /* allow old format commands to work */i++) {
			if (command[i] == (byte)'-') {
				command[i] = (byte)'.';
			} 
		}
		if (!/*Error: Function owner not recognized*/strncmp(command, "flickr.", 7)) {
			command += 7;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(command, "places.forUser")) {
			command = (byte)"places.placesForUser";
		} 
		for (i = 0; ModernizedCProgram.commands[i].getName(); i++) {
			if (!/*Error: Function owner not recognized*/strcmp(command, ModernizedCProgram.commands[i].getName())) {
				cmd_index = i;
				break;
			} 
		}
		if (cmd_index < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No such command `%s'\n", ModernizedCProgram.program, command);
			usage = 1;
			;
		} 
		if ((argc - 1) < ModernizedCProgram.commands[cmd_index].getMin()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Minimum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMin(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (ModernizedCProgram.commands[cmd_index].getMax() > 0 && (argc - 1) > ModernizedCProgram.commands[cmd_index].getMax()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Maxiumum of %d arguments for command `%s'\n  USAGE: %s %s %s\n", ModernizedCProgram.program, ModernizedCProgram.commands[cmd_index].getMax(), command, ModernizedCProgram.program, command, ModernizedCProgram.commands[cmd_index].getArgs());
			usage = 1;
			;
		} 
		if (help) {
			ModernizedCProgram.print_help_string();
			rc = 0;
			;
		} 
		rc = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(fc, argc, /* Perform the API call */argv);
		if (rc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Command %s failed\n", ModernizedCProgram.program, argv[0]);
		} 
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
		flickcurl fc = (null);
		int rc = 0;
		int usage = 0;
		int help = 0;
		byte[] photo_id = (null);
		Byte prefix_uri = "http://www.flickr.com/photos/";
		size_t prefix_uri_len = /*Error: Function owner not recognized*/strlen(prefix_uri);
		Byte serializer_syntax_name = "ntriples";
		raptor_uri base_uri = (null);
		raptor_serializer serializer = (null);
		int request_delay = -1;
		flickcurl_serializer fs = (null);
		flickcurl_photo photo = (null);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		ModernizedCProgram.rworld = ModernizedCProgram.raptor_new_world();
		ModernizedCProgram.raptor_world_open(ModernizedCProgram.rworld);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "Dd:ho:v");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case (byte)'D':
					ModernizedCProgram.debug = 1;
					break;
			case 0:
			case (byte)'h':
					help = 1;
					break;
			case (byte)'o':
					if (ModernizedCProgram.optarg) {
						if (ModernizedCProgram.raptor_world_is_serializer_name(ModernizedCProgram.rworld, ModernizedCProgram.optarg)) {
							serializer_syntax_name = ModernizedCProgram.optarg;
						} else {
								int i;
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: invalid argument `%s' for `-o'\n", ModernizedCProgram.program, ModernizedCProgram.optarg);
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Valid arguments are:\n");
								for (i = 0; 1; i++) {
									raptor_syntax_description d = new raptor_syntax_description();
									d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
									if (!d) {
										break;
									} 
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("  %-12s for %s\n", d.getNames()[0], d.getLabel());
								}
								usage = 1;
								break;
						} 
					} 
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			}
		}
		argv += ModernizedCProgram.optind;
		argc -= ModernizedCProgram.optind;
		if (!help && argc < 1) {
			usage = /* Title and usage */2;
		} 
		if (!help && !argc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No photo URI given\n", ModernizedCProgram.program);
			usage = 1;
			;
		} 
		if (usage || help) {
			;
		} 
		photo_id = argv[0];
		if (/*Error: Function owner not recognized*/strncmp(photo_id, prefix_uri, prefix_uri_len)) {
			usage = 1;
		} else {
				size_t len = new size_t();
				photo_id += prefix_uri_len;
				len = /*Error: Function owner not recognized*/strlen(photo_id);
				if (!len) {
					usage = 1;
				} else {
						if (photo_id[len - 1] == (byte)'/') {
							photo_id[--len] = (byte)'\0';
						} 
						while (photo_id && photo_id != (byte)'/') {
							photo_id++;
						}
						if (!photo_id) {
							usage = 1;
						} else {
								photo_id++;
						} 
				} 
		} 
		if (usage) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Argument is not a Flickr photo URI like\n  http://www.flickr.com/photos/USER/PHOTO/\n", ModernizedCProgram.program);
			;
		} 
		serializer = ModernizedCProgram.raptor_new_serializer(ModernizedCProgram.rworld, serializer_syntax_name);
		if (!serializer) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to create raptor serializer type %s\n", ModernizedCProgram.program, serializer_syntax_name);
			return (true);
		} 
		base_uri = ModernizedCProgram.raptor_new_uri(ModernizedCProgram.rworld, (byte)argv[0]);
		ModernizedCProgram.raptor_serializer_start_to_file_handle(serializer, base_uri, (_iob[1]));
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, (null));
		if (!/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (help) {
			int i;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Get Triples from Flickr photos.");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [OPTIONS] FLICKR-PHOTO-URI\n\n", ModernizedCProgram.program);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_license_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_home_url_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -d  Set delay between requests in milliseconds");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -D  Print lots of output");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -h  Print this help, then exit");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -o  Set output format to one of:");
			for (i = 0; 1; i++) {
				raptor_syntax_description d = new raptor_syntax_description();
				d = ModernizedCProgram.raptor_world_get_serializer_description(ModernizedCProgram.rworld, i);
				if (!d) {
					break;
				} 
				if (!/*Error: Function owner not recognized*/strcmp(d.getNames()[0], serializer_syntax_name)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("      %-15s %s (default)\n", d.getNames()[0], d.getLabel());
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("      %-15s %s\n", d.getNames()[0], d.getLabel());
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    via internal RDF serializer");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		flickcurl_serializer_s flickcurl_serializer_s = new flickcurl_serializer_s();
		fs = flickcurl_serializer_s.flickcurl_new_serializer(fc, serializer, ModernizedCProgram.flickrdf_serializer_factory);
		if (!fs) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Failed to create Flickcurl serializer\n", ModernizedCProgram.program);
			;
		} 
		flickcurl_photo_s flickcurl_photo_s = new flickcurl_photo_s();
		photo = flickcurl_photo_s.flickcurl_photos_getInfo2(fc, photo_id, (null));
		if (!photo) {
			;
		} 
		Byte generatedUri = photo.getUri();
		Byte generatedId = photo.getId();
		int generatedTags_count = photo.getTags_count();
		if (ModernizedCProgram.debug) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Photo with URI %s ID %s has %d tags\n", ModernizedCProgram.program, generatedUri, generatedId, generatedTags_count);
		} 
		rc = ModernizedCProgram.flickcurl_serialize_photo(fs, photo);
		if (fs) {
			fs.flickcurl_free_serializer();
		} 
		if (fc) {
			fc.flickcurl_free();
		} 
		if (serializer) {
			serializer.raptor_free_serializer();
		} 
		if (base_uri) {
			ModernizedCProgram.raptor_free_uri(base_uri);
		} 
		if (ModernizedCProgram.rworld) {
			ModernizedCProgram.raptor_free_world(ModernizedCProgram.rworld);
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
		flickcurl fc = (null);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int mode = 0;
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		if (argc > 1 && argv[1] == (byte)'-') {
			if (!/*Error: Function owner not recognized*/strcmp(argv[1], "-v")) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
				ModernizedCProgram.flickcurl_cmdline_finish();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			} 
			if (!/*Error: Function owner not recognized*/strcmp(argv[1], "-h")) {
				help = 1;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Invalid option `%s'\n", ModernizedCProgram.program, argv[1]);
					usage = 1;
			} 
			;
		} 
		if (argc < 2) {
			usage = /* Title and usage */2;
			;
		} 
		if (!/*Error: Function owner not recognized*/strcmp(argv[1], "manpage")) {
			mode = 0;
		}  else if (!/*Error: Function owner not recognized*/strcmp(argv[1], "extras")) {
			mode = 1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Invalid mode `%s'\n", ModernizedCProgram.program, argv[1]);
				usage = 1;
		} 
		if (help) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Generate manpage for Flickcurl utility.");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [OPTIONS] manual | extras\n\n", ModernizedCProgram.program);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_license_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(ModernizedCProgram.flickcurl_home_url_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n", (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -h  Print this help, then exit");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("  -v  Print the flickcurl version");
			rc = 0;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		if (mode == 0) {
			(_iob[/* mode 0 : man page */1]).mangen_print_man_page();
		} else {
				(_iob[/* mode 1: extras */1]).mangen_print_extras();
		} 
		ModernizedCProgram.flickcurl_finish();
		return (rc);
		flickcurl fc = (null);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int read_auth = 1;
		int i;
		byte[][] methods = (null);
		int count = 0;
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "hv");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case 0:
			case (byte)'h':
					help = 1;
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			}
		}
		if (help) {
			;
		} 
		if (argc != 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Extra arguments given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n\n", (_iob[2]));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, (null));
		if (read_auth && !/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		methods = fc.flickcurl_reflection_getMethods();
		if (!methods) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		for (i = 0; methods[i]; i++) {
			;
		}
		count = i;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: Found %d API methods\n", ModernizedCProgram.program, count);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(methods, count, /*Error: Unsupported expression*/, /* it seems to be sorted when returned but ensure it anyway */compare_strings);
		for (i = 0; methods[i]; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs((byte)methods[i], (_iob[1]));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
		}
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		return (rc);
		flickcurl fc = (null);
		int rc = 0;
		int usage = 0;
		int help = 0;
		int read_auth = 1;
		int i;
		int request_delay = -1;
		byte[] section = new byte[50];
		size_t section_len = new size_t();
		byte[][] methods = (null);
		ModernizedCProgram.flickcurl_init();
		ModernizedCProgram.flickcurl_cmdline_init();
		ModernizedCProgram.program = ModernizedCProgram.flickcurl_cmdline_basename(argv[0]);
		while (!usage && !help) {
			int c;
			c = ModernizedCProgram.getopt(argc, argv, "d:hv");
			if (c == -1) {
				break;
			} 
			switch (c) {
			case 0:
			case (byte)'h':
					help = 1;
					break;
			case (byte)'v':
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_version_string, (_iob[1]));
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
					ModernizedCProgram.flickcurl_cmdline_finish();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(0);
			case (byte)'d':
					if (ModernizedCProgram.optarg) {
						request_delay = /*Error: Function owner not recognized*/atoi(ModernizedCProgram.optarg);
					} 
					break;
			case /* getopt() - unknown option */(byte)'?':
					usage = 1;
					break;
			}
		}
		if (help) {
			;
		} 
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: No API section given\n", ModernizedCProgram.program);
			usage = 1;
		} 
		if (usage) {
			if (usage > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), ModernizedCProgram.title_format_string, ModernizedCProgram.flickcurl_version_string);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("Flickcurl home page: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_home_url_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_copyright_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\nLicense: ", (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(ModernizedCProgram.flickcurl_license_string, (_iob[2]));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n\n", (_iob[2]));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Try `%s -h' for more information.\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		flickcurl_s flickcurl_s = new flickcurl_s();
		fc = flickcurl_s.flickcurl_new();
		if (!fc) {
			rc = 1;
			;
		} 
		fc.flickcurl_set_error_handler(my_message_handler, (null));
		if (read_auth && !/*Error: Function owner not recognized*/access((byte)ModernizedCProgram.flickcurl_cmdline_config_path, R_OK)) {
			if (fc.flickcurl_config_read_ini(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.flickcurl_cmdline_config_section, fc, ModernizedCProgram.flickcurl_config_var_handler)) {
				rc = 1;
				;
			} 
		} 
		if (request_delay >= 0) {
			fc.flickcurl_set_request_delay(request_delay);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section, "flickr.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section + 7, argv[1]);
		for (i = 0; section[i]; /* allow old format commands to work */i++) {
			if (section[i] == (byte)'-') {
				section[i] = (byte)'.';
			} 
		}
		if (!/*Error: Function owner not recognized*/strncmp(section, "flickr.flickr", 13)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(section, section + 7);
		} 
		section_len = /*Error: Function owner not recognized*/strlen(section);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: section '%s'\n", ModernizedCProgram.program, section);
		methods = fc.flickcurl_reflection_getMethods();
		if (!methods) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethods failed\n", ModernizedCProgram.program);
			rc = 1;
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "/* -*- Mode: c; c-basic-offset: 2 -*-\n *\n * %s-api.c - Flickr %s.* API calls\n *\n", argv[1], section);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * Copyright (C) 2010-2012, David Beckett http://www.dajobe.org/\n * \n * This file is licensed under the following three licenses as alternatives:\n *   1. GNU Lesser General Public License (LGPL) V2.1 or any newer version\n *   2. GNU General Public License (GPL) V2 or any newer version\n *   3. Apache License, V2.0 or any newer version\n * \n * You may not use this file except in compliance with at least one of\n * the above three licenses.\n * \n * See LICENSE.html or LICENSE.txt at the top of this package for the\n * complete terms and further detail along with the license texts for\n * the licenses in COPYING.LIB, COPYING and LICENSE-2.0.txt respectively.\n * \n */\n\n#include <stdio.h>\n#include <string.h>\n#include <stdarg.h>\n\n#ifdef HAVE_CONFIG_H\n#include <config.h>\n#endif\n\n#ifdef HAVE_STDLIB_H\n#include <stdlib.h>\n#undef HAVE_STDLIB_H\n#endif\n#ifdef HAVE_UNISTD_H\n#include <unistd.h>\n#endif\n\n#include <flickcurl.h>\n#include <flickcurl_internal.h>\n\n\n");
		flickcurl_method_s flickcurl_method_s = new flickcurl_method_s();
		Byte generatedName = method.getName();
		int generatedArgs_count = method.getArgs_count();
		flickcurl_arg_s[][] generatedArgs = method.getArgs();
		Byte generatedDescription = arg.getDescription();
		int generatedOptional = arg.getOptional();
		for (i = 0; methods[i]; i++) {
			flickcurl_method method = new flickcurl_method();
			Byte method_name;
			byte[] function_name = new byte[100];
			int c;
			int j;
			int is_write = 0;
			if (/*Error: Function owner not recognized*/strncmp(methods[i], section, section_len)) {
				continue;
			} 
			method = flickcurl_method_s.flickcurl_reflection_getMethodInfo(fc, methods[i]);
			if (!method) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: getMethodInfo(%s) failed\n", ModernizedCProgram.program, methods[i]);
				rc = 1;
				break;
			} 
			method_name = generatedName;
			if (/*Error: Function owner not recognized*/strstr(method_name, ".add") || /*Error: Function owner not recognized*/strstr(method_name, ".create") || /*Error: Function owner not recognized*/strstr(method_name, ".delete") || /*Error: Function owner not recognized*/strstr(method_name, ".edit") || /*Error: Function owner not recognized*/strstr(method_name, ".remove") || /*Error: Function owner not recognized*/strstr(method_name, ".set")) {
				is_write = 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(function_name, "flickcurl_");
			for (j = 0; (c = methods[i][j + 7]); j++) {
				if (c == (byte)'.') {
					c = (byte)'_';
				} 
				function_name[j + 10] = c;
			}
			function_name[j + 10] = (byte)'\0';
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "/**\n * %s:\n", function_name);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), /* fixed arguments */" * @fc: flickcurl context\n");
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * @%s: %s", generatedName, generatedDescription);
					if (generatedOptional) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page")) ? " (or < 0)" : " (or NULL)"), (_iob[1]));
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputc((byte)'\n', (_iob[1]));
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * \n * %s\n *\n * Implements %s (%s)\n", generatedDescription, generatedName, ModernizedCProgram.flickcurl_version_string);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " * \n * Return value: non-0 on failure\n **/\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "int\n%s(flickcurl* fc", function_name);
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ", int %s", generatedName);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ", const char* %s", generatedName);
					} 
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ")\n{\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  xmlDocPtr doc = NULL;\n  xmlXPathContextPtr xpathCtx = NULL; \n  void* result = NULL;\n");
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  char %s_str[10];\n", generatedName);
					} 
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs("\n  flickcurl_init_params(fc, 0);\n\n", (_iob[1]));
			if (generatedArgs_count) {
				int argi;
				int print_or = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(");
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if (!generatedOptional) {
						if (print_or) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), " || ");
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "!%s", generatedName);
						print_or = 1;
					} 
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), ")\n    return 1;\n\n");
			} 
			if (generatedArgs_count) {
				int argi;
				for (argi = 0; generatedArgs[argi]; argi++) {
					flickcurl_arg arg = generatedArgs[argi];
					if (!/*Error: Function owner not recognized*/strcmp(generatedName, "api_key")) {
						continue;
					} 
					if (generatedOptional) {
						if ((!/*Error: Function owner not recognized*/strcmp(generatedName, "per_page") || !/*Error: Function owner not recognized*/strcmp(generatedName, "page"))) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(%s >= 0) {\n    sprintf(%s_str, \"%%d\", %s);\n    flickcurl_add_param(fc, \"%s\", %s_str);\n  }\n", generatedName, generatedName, generatedName, generatedName, generatedName);
							continue;
						} 
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  if(%s)\n", generatedName);
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  flickcurl_add_param(fc, \"%s\", %s);\n", generatedName, generatedName);
				}
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "\n  flickcurl_end_params(fc);\n\n  if(flickcurl_prepare(fc, \"%s\"))\n    goto tidy;\n\n", generatedName);
			if (is_write) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  flickcurl_set_write(fc, 1);\n  flickcurl_set_data(fc, (void*)\"\", 0);\n\n");
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "  doc = flickcurl_invoke(fc);\n  if(!doc)\n    goto tidy;\n\n\n  xpathCtx = xmlXPathNewContext(doc);\n  if(!xpathCtx) {\n    flickcurl_error(fc, \"Failed to create XPath context for document\");\n    fc->failed = 1;\n    goto tidy;\n  }\n\n  result = NULL; /* your code here */\n\n  tidy:\n  if(xpathCtx)\n    xmlXPathFreeContext(xpathCtx);\n\n  if(fc->failed)\n    result = NULL;\n\n  return (result == NULL);\n}\n\n\n");
			method.flickcurl_free_method();
		}
		if (fc) {
			fc.flickcurl_free();
		} 
		ModernizedCProgram.flickcurl_finish();
		ModernizedCProgram.flickcurl_cmdline_finish();
		return (rc);
	}
	private static int flickcurl_cmdline_init() {
		size_t config_len = 15;
		Byte home;
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 0;
		} 
		home = /*Error: Function owner not recognized*/getenv("HOME");
		if (home) {
			config_len += /*Error: Function owner not recognized*/strlen(home) + 1;
		} 
		ModernizedCProgram.flickcurl_cmdline_config_path = /*Error: Function owner not recognized*/malloc(config_len + 1);
		if (!ModernizedCProgram.flickcurl_cmdline_config_path) {
			return 1;
		} 
		if (home) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ModernizedCProgram.flickcurl_cmdline_config_path, "%s/%s", home, ModernizedCProgram.config_filename);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.flickcurl_cmdline_config_path, ModernizedCProgram.config_filename, config_len + 1);
		} 
		return 0;
	}
	private static void flickcurl_finish() {
		ModernizedCProgram.flickcurl_serializer_terminate();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/xmlCleanupParser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/curl_global_cleanup();
	}
	private static void flickcurl_serializer_terminate() {
	}
	/**
	 * flickcurl_new_serializer:
	 * @fc: flickcurl object
	 * @data: user data for factory methods
	 * @factory: triples serializer factory
	 *
	 * Create a new triples serializer for generating a RDF triples
	 * representation of a Flickr photo.
	 *
	 * The factory must contain the methods and the correct factory API
	 * version as described in #flickcurl_serializer_factory
	 *
	 * Return value: a new serializer object or NULL on failure
	 *
	*/
	private static void flickcurl_cmdline_finish() {
		if (ModernizedCProgram.flickcurl_cmdline_config_path) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.flickcurl_cmdline_config_path);
		} 
	}
	private static int raptor_world_open(Object world) {
		return 0;
	}
	private static void raptor_serializer_start_to_file_handle( serializer, Object base_uri, _iobuf fh) {
		serializer.setFh(fh);
		Object generatedOutput_turtle = serializer.getOutput_turtle();
		if (base_uri && generatedOutput_turtle) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(fh, "@base <%s>\n", (byte)base_uri);
		} 
	}
}
