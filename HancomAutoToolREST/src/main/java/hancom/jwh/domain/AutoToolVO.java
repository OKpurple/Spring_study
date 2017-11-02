package hancom.jwh.domain;

public class AutoToolVO {
	private int s_no;
	private String tool_name;
	private String tool_filename;
	private String tool_folder;
	private String reg_date;
	private String update_date;
	private int Ver;
	private int ver_middle;
	private String tool_uuid;
	private String registrant_name;
	private String tool_status;
	private String memo;
	
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getTool_name() {
		return tool_name;
	}
	public void setTool_name(String tool_name) {
		this.tool_name = tool_name;
	}
	public String getTool_filename() {
		return tool_filename;
	}
	public void setTool_filename(String tool_filename) {
		this.tool_filename = tool_filename;
	}
	public String getTool_folder() {
		return tool_folder;
	}
	public void setTool_folder(String tool_folder) {
		this.tool_folder = tool_folder;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public int getVer() {
		return Ver;
	}
	public void setVer(int ver) {
		Ver = ver;
	}
	public int getVer_middle() {
		return ver_middle;
	}
	public void setVer_middle(int ver_middle) {
		this.ver_middle = ver_middle;
	}
	public String getTool_uuid() {
		return tool_uuid;
	}
	public void setTool_uuid(String tool_uuid) {
		this.tool_uuid = tool_uuid;
	}
	public String getRegistrant_name() {
		return registrant_name;
	}
	public void setRegistrant_name(String registrant_name) {
		this.registrant_name = registrant_name;
	}
	public String getTool_status() {
		return tool_status;
	}
	public void setTool_status(String tool_status) {
		this.tool_status = tool_status;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
