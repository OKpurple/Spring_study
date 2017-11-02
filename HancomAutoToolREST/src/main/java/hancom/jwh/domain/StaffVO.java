package hancom.jwh.domain;

public class StaffVO {
	private String NAME;
	private String memberid;
	private String team;
	private String PW;
	private String EMAIL;
	private String plan_menu_info;
	private String num_count_info;
	private String menu_level_info;
	private String test_kind_info;
	private String main_project_info;
	private String empower;
	
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPlan_menu_info() {
		return plan_menu_info;
	}
	public void setPlan_menu_info(String plan_menu_info) {
		this.plan_menu_info = plan_menu_info;
	}
	public String getNum_count_info() {
		return num_count_info;
	}
	public void setNum_count_info(String num_count_info) {
		this.num_count_info = num_count_info;
	}
	public String getMenu_level_info() {
		return menu_level_info;
	}
	public void setMenu_level_info(String menu_level_info) {
		this.menu_level_info = menu_level_info;
	}
	public String getTest_kind_info() {
		return test_kind_info;
	}
	public void setTest_kind_info(String test_kind_info) {
		this.test_kind_info = test_kind_info;
	}
	public String getMain_project_info() {
		return main_project_info;
	}
	public void setMain_project_info(String main_project_info) {
		this.main_project_info = main_project_info;
	}
	public String getEmpower() {
		return empower;
	}
	public void setEmpower(String empower) {
		this.empower = empower;
	}  
}
