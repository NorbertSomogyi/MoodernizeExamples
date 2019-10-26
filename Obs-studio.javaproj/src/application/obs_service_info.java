package application;

/******************************************************************************
    Copyright (C) 2013-2014 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
/**
 * @file
 * @brief header for modules implementing services.
 *
 * Services are modules that implement provider specific settings for outputs.
 */
public class obs_service_info {
	private Object id;
	private Object get_name;
	private Object create;
	private Object destroy;
	private Object activate;
	private Object deactivate;
	private Object update;
	private Object get_defaults;
	private Object get_properties;
	private Object initialize;
	private Object get_url;
	private Object get_key;
	private Object get_username;
	private Object get_password;
	private Object supports_multitrack;
	private Object apply_encoder_settings;
	private Object type_data;
	private Object free_type_data;
	private Object get_output_type;
	
	public obs_service_info(Object id, Object get_name, Object create, Object destroy, Object activate, Object deactivate, Object update, Object get_defaults, Object get_properties, Object initialize, Object get_url, Object get_key, Object get_username, Object get_password, Object supports_multitrack, Object apply_encoder_settings, Object type_data, Object free_type_data, Object get_output_type) {
		setId(id);
		setGet_name(get_name);
		setCreate(create);
		setDestroy(destroy);
		setActivate(activate);
		setDeactivate(deactivate);
		setUpdate(update);
		setGet_defaults(get_defaults);
		setGet_properties(get_properties);
		setInitialize(initialize);
		setGet_url(get_url);
		setGet_key(get_key);
		setGet_username(get_username);
		setGet_password(get_password);
		setSupports_multitrack(supports_multitrack);
		setApply_encoder_settings(apply_encoder_settings);
		setType_data(type_data);
		setFree_type_data(free_type_data);
		setGet_output_type(get_output_type);
	}
	public obs_service_info() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getGet_name() {
		return get_name;
	}
	public void setGet_name(Object newGet_name) {
		get_name = newGet_name;
	}
	public Object getCreate() {
		return create;
	}
	public void setCreate(Object newCreate) {
		create = newCreate;
	}
	public Object getDestroy() {
		return destroy;
	}
	public void setDestroy(Object newDestroy) {
		destroy = newDestroy;
	}
	public Object getActivate() {
		return activate;
	}
	public void setActivate(Object newActivate) {
		activate = newActivate;
	}
	public Object getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(Object newDeactivate) {
		deactivate = newDeactivate;
	}
	public Object getUpdate() {
		return update;
	}
	public void setUpdate(Object newUpdate) {
		update = newUpdate;
	}
	public Object getGet_defaults() {
		return get_defaults;
	}
	public void setGet_defaults(Object newGet_defaults) {
		get_defaults = newGet_defaults;
	}
	public Object getGet_properties() {
		return get_properties;
	}
	public void setGet_properties(Object newGet_properties) {
		get_properties = newGet_properties;
	}
	public Object getInitialize() {
		return initialize;
	}
	public void setInitialize(Object newInitialize) {
		initialize = newInitialize;
	}
	public Object getGet_url() {
		return get_url;
	}
	public void setGet_url(Object newGet_url) {
		get_url = newGet_url;
	}
	public Object getGet_key() {
		return get_key;
	}
	public void setGet_key(Object newGet_key) {
		get_key = newGet_key;
	}
	public Object getGet_username() {
		return get_username;
	}
	public void setGet_username(Object newGet_username) {
		get_username = newGet_username;
	}
	public Object getGet_password() {
		return get_password;
	}
	public void setGet_password(Object newGet_password) {
		get_password = newGet_password;
	}
	public Object getSupports_multitrack() {
		return supports_multitrack;
	}
	public void setSupports_multitrack(Object newSupports_multitrack) {
		supports_multitrack = newSupports_multitrack;
	}
	public Object getApply_encoder_settings() {
		return apply_encoder_settings;
	}
	public void setApply_encoder_settings(Object newApply_encoder_settings) {
		apply_encoder_settings = newApply_encoder_settings;
	}
	public Object getType_data() {
		return type_data;
	}
	public void setType_data(Object newType_data) {
		type_data = newType_data;
	}
	public Object getFree_type_data() {
		return free_type_data;
	}
	public void setFree_type_data(Object newFree_type_data) {
		free_type_data = newFree_type_data;
	}
	public Object getGet_output_type() {
		return get_output_type;
	}
	public void setGet_output_type(Object newGet_output_type) {
		get_output_type = newGet_output_type;
	}
}
/* required */
