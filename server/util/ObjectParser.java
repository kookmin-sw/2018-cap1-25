/**ADD jihoon*/
package cp.orbit.common.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import cp.orbit.account.domain.ComKeyVO;
import cp.orbit.account.domain.PasswordVO;
import cp.orbit.account.domain.TeacherVO;
import cp.orbit.category.domain.CategoryModVO;
import cp.orbit.category.domain.ContentCategoryVO;
import cp.orbit.content.domain.ContentDeleteKeysVO;
import cp.orbit.content.domain.ContentVO;
import cp.orbit.quiz.domain.*;
import cp.orbit.tacategory.domain.TACategoryModVO;
import cp.orbit.tacategory.domain.TACategoryVO;
import cp.orbit.task.domain.TaskQuizVO;
import cp.orbit.task.domain.TaskStudentVO;
import cp.orbit.task.domain.TaskVO;

/**
 * jsonObject를 필요한 객체로 변환합니다. *  
 * @version  1.00 
 * @author 이지훈  
 */
public class ObjectParser {
	
	/**
	 * Json Data를 ContentVO 로 변환한다. 
	 * @param jsonObject
	 * @return ContentVO
	 * @throws Exception
	 */
	public ContentVO contentVOParser(JsonObject jsonData) throws Exception{
		
		ContentVO content = new ContentVO();
		
		if(jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			content.setConts_no(jsonData.get("conts_no").getAsInt());
		if(jsonData.get("memb_id")!=null && !jsonData.get("memb_id").getAsString().equals(""))
			content.setMemb_id(jsonData.get("memb_id").getAsString());
		if(jsonData.get("ytb_yn")!=null && !jsonData.get("ytb_yn").getAsString().equals(""))
			content.setYtb_yn(jsonData.get("ytb_yn").getAsString());
		if(jsonData.get("file_uplo_yn")!=null && !jsonData.get("file_uplo_yn").getAsString().equals(""))
			content.setFile_uplo_yn(jsonData.get("file_uplo_yn").getAsString());
		if(jsonData.get("ytb_link")!=null && !jsonData.get("ytb_link").getAsString().equals(""))
			content.setYtb_link(jsonData.get("ytb_link").getAsString());
		if(jsonData.get("conts_tit")!=null && !jsonData.get("conts_tit").getAsString().equals(""))
			content.setConts_tit(jsonData.get("conts_tit").getAsString());
		if(jsonData.get("icon_file_no") != null && !jsonData.get("icon_file_no").getAsString().equals(""))
			content.setIcon_file_no(jsonData.get("icon_file_no").getAsInt());
		if(jsonData.get("school_div_cd") != null && !jsonData.get("school_div_cd").getAsString().equals(""))
			content.setSchool_div_cd(jsonData.get("school_div_cd").getAsString());
		if(jsonData.get("grade") != null && !jsonData.get("grade").getAsString().equals(""))
			content.setGrade(jsonData.get("grade").getAsString());
		if(jsonData.get("subje_cd")!=null && !jsonData.get("subje_cd").getAsString().equals(""))
			content.setSubje_cd(jsonData.get("subje_cd").getAsString());
		if(jsonData.get("conts_sumy_expln")!=null && !jsonData.get("conts_sumy_expln").getAsString().equals(""))
			content.setConts_sumy_expln(jsonData.get("conts_sumy_expln").getAsString());
		if(jsonData.get("conts_expln")!=null && !jsonData.get("conts_expln").getAsString().equals(""))
			content.setConts_expln(jsonData.get("conts_expln").getAsString());
		if(jsonData.get("subtit_file_no")!=null && !jsonData.get("subtit_file_no").getAsString().equals(""))
			content.setSubtit_file_no(jsonData.get("subtit_file_no").getAsInt());
		if(jsonData.get("uplo_file_no")!=null && !jsonData.get("uplo_file_no").getAsString().equals(""))
			content.setUplo_file_no(jsonData.get("uplo_file_no").getAsInt());
		if(jsonData.get("update_id")!=null && !jsonData.get("update_id").getAsString().equals(""))
			content.setUpdate_id(jsonData.get("update_id").getAsString());
		if (jsonData.get("conts_tp_cd") != null && !jsonData.get("conts_tp_cd").getAsString().equals(""))
			content.setConts_tp_cd(jsonData.get("conts_tp_cd").getAsString());
		if(jsonData.get("regist_id")!=null && !jsonData.get("regist_id").getAsString().equals(""))
			content.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("cate_no") != null && !jsonData.get("cate_no").getAsString().equals(""))
			content.setCate_no(jsonData.get("cate_no").getAsInt());
		if (jsonData.get("all_ply_tm") != null && !jsonData.get("all_ply_tm").getAsString().equals(""))
			content.setAll_ply_tm(jsonData.get("all_ply_tm").getAsString());

		return content;
	}

	
	/**
	 * Json Data를 TaskVO 로 변환한다. 
	 * @param jsonObject
	 * @return TaskVO
	 * @throws Exception
	 */
	public TaskVO taskVOParser(JsonObject jsonData) throws Exception {

		TaskVO task = new TaskVO();

		if (jsonData.get("task_no") != null && !jsonData.get("task_no").getAsString().equals(""))
			task.setTask_no(jsonData.get("task_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			task.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			task.setConts_no(jsonData.get("conts_no").getAsInt());

		if (jsonData.get("task_nm") != null && !jsonData.get("task_nm").getAsString().equals(""))
			task.setTask_nm(jsonData.get("task_nm").getAsString());
		if (jsonData.get("task_detail") != null && !jsonData.get("task_detail").getAsString().equals(""))
			task.setTask_detail(jsonData.get("task_detail").getAsString());
		if (jsonData.get("score") != null && !jsonData.get("score").getAsString().equals(""))
			task.setScore(jsonData.get("score").getAsInt());

		if (jsonData.get("end_dt") != null && !jsonData.get("end_dt").getAsString().equals(""))
			task.setEnd_dt(jsonData.get("end_dt").getAsString());
		if (jsonData.get("end_tm") != null && !jsonData.get("end_tm").getAsString().equals(""))
			task.setEnd_tm(jsonData.get("end_tm").getAsString());
		if (jsonData.get("task_st") != null && !jsonData.get("task_st").getAsString().equals(""))
			task.setTask_st(jsonData.get("task_st").getAsString());
		if (jsonData.get("start_dt") != null && !jsonData.get("start_dt").getAsString().equals(""))
			task.setStart_dt(jsonData.get("start_dt").getAsString());
		if (jsonData.get("start_tm") != null && !jsonData.get("start_tm").getAsString().equals(""))
			task.setStart_tm(jsonData.get("start_tm").getAsString());

		if (jsonData.get("task_link") != null && !jsonData.get("task_link").getAsString().equals(""))
			task.setTask_link(jsonData.get("task_link").getAsString());
		if (jsonData.get("short_link") != null && !jsonData.get("short_link").getAsString().equals(""))
			task.setShort_link(jsonData.get("short_link").getAsString());

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			task.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			task.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			task.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			task.setUpdate_id(jsonData.get("update_id").getAsString());

		if (jsonData.get("cate_no") != null && !jsonData.get("cate_no").getAsString().equals(""))
			task.setCate_no(jsonData.get("cate_no").getAsInt());
		/**ADD jihoon*/
		if (jsonData.get("task_regist_yn") != null && !jsonData.get("task_regist_yn").getAsString().equals(""))
			task.setTask_regist_yn(jsonData.get("task_regist_yn").getAsString());
		return task;
	}

	
	/**
	 * Json Data를 TaskStudentVO 로 변환한다. 
	 * @param jsonObject
	 * @return TaskStudentVO
	 * @throws Exception
	 */
	public TaskStudentVO taskStudentVOParser(JsonObject jsonData) throws Exception {

		TaskStudentVO taskStudent = new TaskStudentVO();

		if (jsonData.get("task_play_no") != null && !jsonData.get("task_play_no").getAsString().equals(""))
			taskStudent.setTask_play_no(jsonData.get("task_play_no").getAsInt());
		if (jsonData.get("task_no") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskStudent.setTask_no(jsonData.get("task_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			taskStudent.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("stud_typ_cd") != null && !jsonData.get("stud_typ_cd").getAsString().equals(""))
			taskStudent.setStud_typ_cd(jsonData.get("stud_typ_cd").getAsString());
		if (jsonData.get("stud_no") != null && !jsonData.get("stud_no").getAsString().equals(""))
			taskStudent.setStud_no(jsonData.get("stud_no").getAsInt());
		if (jsonData.get("nicknm") != null && !jsonData.get("nicknm").getAsString().equals(""))
			taskStudent.setNicknm(jsonData.get("nicknm").getAsString());
		if (jsonData.get("memb_div_cd") != null && !jsonData.get("memb_div_cd").getAsString().equals(""))
			taskStudent.setMemb_div_cd(jsonData.get("memb_div_cd").getAsString());
		if (jsonData.get("test_start_dt") != null && !jsonData.get("test_start_dt").getAsString().equals(""))
			taskStudent.setTest_start_dt(jsonData.get("test_start_dt").getAsString());
		if (jsonData.get("test_end_dt") != null && !jsonData.get("test_end_dt").getAsString().equals(""))
			taskStudent.setTest_end_dt(jsonData.get("test_end_dt").getAsString());
		if (jsonData.get("submit_yn") != null && !jsonData.get("submit_yn").getAsString().equals(""))
			taskStudent.setSubmit_yn(jsonData.get("submit_yn").getAsString());
		if (jsonData.get("ansok_cnt") != null && !jsonData.get("ansok_cnt").getAsString().equals(""))
			taskStudent.setAnsok_cnt(jsonData.get("ansok_cnt").getAsInt());
		if (jsonData.get("inans_cnt") != null && !jsonData.get("inans_cnt").getAsString().equals(""))
			taskStudent.setInans_cnt(jsonData.get("inans_cnt").getAsInt());
		if (jsonData.get("unknow_cnt") != null && !jsonData.get("unknow_cnt").getAsString().equals(""))
			taskStudent.setUnknow_cnt(jsonData.get("unknow_cnt").getAsInt());
		if (jsonData.get("score") != null && !jsonData.get("score").getAsString().equals(""))
			taskStudent.setScore(jsonData.get("score").getAsInt());
		if (jsonData.get("ansok_percent") != null && !jsonData.get("ansok_percent").getAsString().equals(""))
			taskStudent.setAnsok_percent(jsonData.get("ansok_percent").getAsInt());
		if (jsonData.get("play_st_cd") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskStudent.setPlay_st_cd(jsonData.get("play_st_cd").getAsString());
		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			taskStudent.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			taskStudent.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			taskStudent.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			taskStudent.setUpdate_id(jsonData.get("update_id").getAsString());
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			taskStudent.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("result") != null && !jsonData.get("result").getAsString().equals(""))
			taskStudent.setResult(jsonData.get("result").getAsInt());
		return taskStudent;
	}
	
	
	
	/**
	 * Json Data를 TaskQuizVO 로 변환한다. 
	 * @param jsonObject
	 * @return TaskQuizVO
	 * @throws Exception
	 */
	public TaskQuizVO parserTaskQuizVO(JsonObject jsonData) throws Exception {

		TaskQuizVO taskQuiz = new TaskQuizVO();

		if (jsonData.get("task_play_no") != null && !jsonData.get("task_play_no").getAsString().equals(""))
			taskQuiz.setTask_play_no(jsonData.get("task_play_no").getAsInt());
		if (jsonData.get("task_no") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setTask_no(jsonData.get("task_no").getAsInt());
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			taskQuiz.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
			taskQuiz.setQuiz_no(jsonData.get("quiz_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			taskQuiz.setMemb_id(jsonData.get("memb_id").getAsString());
		
		if (jsonData.get("view_select_no") != null && !jsonData.get("view_select_no").getAsString().equals(""))
			taskQuiz.setView_select_no(jsonData.get("view_select_no").getAsInt());
		
		if (jsonData.get("input_ans") != null && !jsonData.get("input_ans").getAsString().equals(""))
			taskQuiz.setInput_ans(jsonData.get("input_ans").getAsString());
		
		if (jsonData.get("ansok_yn") != null && !jsonData.get("ansok_yn").getAsString().equals(""))
			taskQuiz.setAnsok_yn(jsonData.get("ansok_yn").getAsString());
		
		if (jsonData.get("acqui_discore") != null && !jsonData.get("acqui_discore").getAsString().equals(""))
			taskQuiz.setAcqui_discore(jsonData.get("acqui_discore").getAsInt());
		
		if (jsonData.get("play_start_datm") != null && !jsonData.get("play_start_datm").getAsString().equals(""))
			taskQuiz.setPlay_start_datm(jsonData.get("play_start_datm").getAsString());
		
		if (jsonData.get("play_end_datm") != null && !jsonData.get("play_end_datm").getAsString().equals(""))
			taskQuiz.setPlay_end_datm(jsonData.get("play_end_datm").getAsString());
		
		if (jsonData.get("click_cnt") != null && !jsonData.get("click_cnt").getAsString().equals(""))
			taskQuiz.setClick_cnt(jsonData.get("click_cnt").getAsInt());
		
		if (jsonData.get("regist_dt") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setUpdate_id(jsonData.get("update_id").getAsString());
		if (jsonData.get("conts_no") != null && !jsonData.get("task_no").getAsString().equals(""))
			taskQuiz.setConts_no(jsonData.get("conts_no").getAsInt());

		return taskQuiz;
	}

	
	/**
	 * Json Data를 ContentDeleteKeysVO 로 변환한다. 
	 * @param jsonObject
	 * @return ContentDeleteKeysVO
	 * @throws Exception
	 */
	public ContentDeleteKeysVO contentDeleteKeysVOParser(JsonObject jsonData) throws Exception {

		ContentDeleteKeysVO contentdelete = new ContentDeleteKeysVO();
		JsonArray jarr = jsonData.get("contentDeleteKeys").getAsJsonArray();
		List<ContentVO> contents = new ArrayList<ContentVO>();
		int arrSize = jarr.size();
		for (int i = 0; i < arrSize; i++) {
			JsonObject atst = jarr.get(i).getAsJsonObject();
			ContentVO cont = new ContentVO();
			if (atst.get("memb_id") != null && !atst.get("memb_id").getAsString().equals(""))
				cont.setMemb_id(atst.get("memb_id").getAsString());
			if (atst.get("conts_no") != null && !atst.get("conts_no").getAsString().equals(""))
				cont.setConts_no(atst.get("conts_no").getAsInt());
			
			contents.add(cont);
		}
		contentdelete.setContentDeleteKeys(contents);
		return contentdelete;
	}

	
	/**
	 * Json Data를 ContentCategoryVO 로 변환한다. 
	 * @param jsonObject
	 * @return ContentCategoryVO
	 * @throws Exception
	 */
	public ContentCategoryVO contentCategoryVOParser(JsonObject jsonData) throws Exception {
		ContentCategoryVO contentCategory = new ContentCategoryVO();
		if (jsonData.get("cate_no") != null && !jsonData.get("cate_no").getAsString().equals(""))
			contentCategory.setCate_no(jsonData.get("cate_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			contentCategory.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("cate_nm") != null && !jsonData.get("cate_nm").getAsString().equals(""))
			contentCategory.setCate_nm(jsonData.get("cate_nm").getAsString());
		if (jsonData.get("cate_hrank_no") != null && !jsonData.get("cate_hrank_no").getAsString().equals(""))
			contentCategory.setCate_hrank_no(jsonData.get("cate_hrank_no").getAsInt());
		if (jsonData.get("sort_order") != null && !jsonData.get("sort_order").getAsString().equals(""))
			contentCategory.setSort_order(jsonData.get("sort_order").getAsInt());
		if (jsonData.get("cate_level") != null && !jsonData.get("cate_level").getAsString().equals(""))
			contentCategory.setCate_level(jsonData.get("cate_level").getAsInt());
		if (jsonData.get("use_yn") != null && !jsonData.get("use_yn").getAsString().equals(""))
			contentCategory.setUse_yn(jsonData.get("use_yn").getAsString());
		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			contentCategory.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			contentCategory.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			contentCategory.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			contentCategory.setUpdate_id(jsonData.get("update_id").getAsString());

		return contentCategory;
	}

	
	/**
	 * Json Data를 TACategoryVO 로 변환한다. 
	 * @param jsonObject
	 * @return TACategoryVO
	 * @throws Exception
	 */
	public TACategoryVO tACategoryVOParser(JsonObject jsonData) throws Exception {
		TACategoryVO tacontentCategory = new TACategoryVO();
		if (jsonData.get("cate_no") != null && !jsonData.get("cate_no").getAsString().equals(""))
			tacontentCategory.setCate_no(jsonData.get("cate_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			tacontentCategory.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("cate_nm") != null && !jsonData.get("cate_nm").getAsString().equals(""))
			tacontentCategory.setCate_nm(jsonData.get("cate_nm").getAsString());
		if (jsonData.get("cate_hrank_no") != null && !jsonData.get("cate_hrank_no").getAsString().equals(""))
			tacontentCategory.setCate_hrank_no(jsonData.get("cate_hrank_no").getAsInt());
		if (jsonData.get("sort_order") != null && !jsonData.get("sort_order").getAsString().equals(""))
			tacontentCategory.setSort_order(jsonData.get("sort_order").getAsInt());
		if (jsonData.get("cate_level") != null && !jsonData.get("cate_level").getAsString().equals(""))
			tacontentCategory.setCate_level(jsonData.get("cate_level").getAsInt());
		if (jsonData.get("use_yn") != null && !jsonData.get("use_yn").getAsString().equals(""))
			tacontentCategory.setUse_yn(jsonData.get("use_yn").getAsString());
		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			tacontentCategory.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			tacontentCategory.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			tacontentCategory.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			tacontentCategory.setUpdate_id(jsonData.get("update_id").getAsString());

		return tacontentCategory;
	}

	
	/**
	 * Json Data를 CategoryModVO 로 변환한다. 
	 * @param jsonObject
	 * @return CategoryModVO
	 * @throws Exception
	 */
	public CategoryModVO categoryModVOParser(JsonObject jsonData) throws Exception {
		CategoryModVO categoryModVO = new CategoryModVO();
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			categoryModVO.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			categoryModVO.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("prevCates") != null) {
			JsonArray jarr = jsonData.get("prevCates").getAsJsonArray();
			ArrayList<Integer> prevCates = new ArrayList<Integer>();
			for (int i = 0; i < jarr.size(); i++) {
				prevCates.add(jarr.get(i).getAsInt());
			}
			categoryModVO.setPrevCates(prevCates);
		}

		if (jsonData.get("nextCates") != null) {
			JsonArray jarr = jsonData.get("nextCates").getAsJsonArray();
			ArrayList<Integer> nextCates = new ArrayList<Integer>();
			for (int i = 0; i < jarr.size(); i++) {

				nextCates.add(jarr.get(i).getAsInt());
			}
			categoryModVO.setNextCates(nextCates);
		}

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			categoryModVO.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			categoryModVO.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			categoryModVO.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			categoryModVO.setUpdate_id(jsonData.get("update_id").getAsString());

		return categoryModVO;
	}
	
	
	/**
	 * Json Data를 TACategoryModVO 로 변환한다. 
	 * @param jsonObject
	 * @return TACategoryModVO
	 * @throws Exception
	 */
	public TACategoryModVO tACategoryModVOParser(JsonObject jsonData) throws Exception {
		TACategoryModVO tacategoryModVO = new TACategoryModVO();
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			tacategoryModVO.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			tacategoryModVO.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("prevCates") != null && !jsonData.get("prevCates").getAsString().equals("")) {
			JsonArray jarr = jsonData.get("prevCates").getAsJsonArray();
			ArrayList<Integer> prevCates = new ArrayList<Integer>();
			for (int i = 0; i < jarr.size(); i++) {
				prevCates.add(jarr.get(i).getAsInt());
			}
			tacategoryModVO.setPrevCates(prevCates);
		}

		if (jsonData.get("nextCates") != null && !jsonData.get("nextCates").getAsString().equals("")) {
			JsonArray jarr = jsonData.get("nextCates").getAsJsonArray();
			ArrayList<Integer> nextCates = new ArrayList<Integer>();
			for (int i = 0; i < jarr.size(); i++) {

				nextCates.add(jarr.get(i).getAsInt());
			}
			tacategoryModVO.setNextCates(nextCates);
		}

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			tacategoryModVO.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			tacategoryModVO.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			tacategoryModVO.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			tacategoryModVO.setUpdate_id(jsonData.get("update_id").getAsString());

		return tacategoryModVO;
	}

	
	/**
	 * Json Data를 TeacherVO 로 변환한다. 
	 * @param jsonObject
	 * @return TeacherVO
	 * @throws Exception
	 */
	public TeacherVO teacherVOParser(JsonObject jsonData) throws Exception {
		TeacherVO teacherVO = new TeacherVO();
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			teacherVO.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("email") != null && !jsonData.get("email").getAsString().equals(""))
			teacherVO.setEmail(jsonData.get("email").getAsString());

		if (jsonData.get("pw") != null && !jsonData.get("pw").getAsString().equals(""))
			teacherVO.setPw(jsonData.get("pw").getAsString());

		if (jsonData.get("memb_nm") != null && !jsonData.get("memb_nm").getAsString().equals(""))
			teacherVO.setMemb_nm(jsonData.get("memb_nm").getAsString());

		if (jsonData.get("nicknm") != null && !jsonData.get("nicknm").getAsString().equals(""))
			teacherVO.setNicknm(jsonData.get("nicknm").getAsString());

		if (jsonData.get("hp_no") != null && !jsonData.get("hp_no").getAsString().equals(""))
			teacherVO.setHp_no(jsonData.get("hp_no").getAsString());

		if (jsonData.get("tel_no") != null && !jsonData.get("tel_no").getAsString().equals(""))
			teacherVO.setTel_no(jsonData.get("tel_no").getAsString());

		if (jsonData.get("st_cd") != null && !jsonData.get("st_cd").getAsString().equals(""))
			teacherVO.setSt_cd(jsonData.get("st_cd").getAsString());
		if (jsonData.get("file_no") != null && !jsonData.get("file_no").getAsString().equals(""))
			teacherVO.setFile_no(jsonData.get("file_no").getAsInt());

		if (jsonData.get("auth_cd") != null && !jsonData.get("auth_cd").getAsString().equals(""))
			teacherVO.setAuth_cd(jsonData.get("auth_cd").getAsString());

		if (jsonData.get("admin_yn") != null && !jsonData.get("admin_yn").getAsString().equals(""))
			teacherVO.setAdmin_yn(jsonData.get("admin_yn").getAsString());

		if (jsonData.get("gend_cd") != null && !jsonData.get("gend_cd").getAsString().equals(""))
			teacherVO.setGend_cd(jsonData.get("gend_cd").getAsString());

		if (jsonData.get("ass_nm") != null && !jsonData.get("ass_nm").getAsString().equals(""))
			teacherVO.setAss_nm(jsonData.get("ass_nm").getAsString());

		if (jsonData.get("birthdt") != null && !jsonData.get("birthdt").getAsString().equals(""))
			teacherVO.setBirthdt(jsonData.get("birthdt").getAsString());

		if (jsonData.get("term_agree_yn") != null && !jsonData.get("term_agree_yn").getAsString().equals(""))
			teacherVO.setTerm_agree_yn(jsonData.get("term_agree_yn").getAsString());

		if (jsonData.get("privacy_agree_yn") != null && !jsonData.get("privacy_agree_yn").getAsString().equals(""))
			teacherVO.setPrivacy_agree_yn(jsonData.get("privacy_agree_yn").getAsString());

		if (jsonData.get("email_certi_yn") != null && !jsonData.get("email_certi_yn").getAsString().equals(""))
			teacherVO.setEmail_certi_yn(jsonData.get("email_certi_yn").getAsString());

		if (jsonData.get("hp_certi_yn") != null && !jsonData.get("hp_certi_yn").getAsString().equals(""))
			teacherVO.setHp_certi_yn(jsonData.get("hp_certi_yn").getAsString());

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			teacherVO.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			teacherVO.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			teacherVO.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			teacherVO.setUpdate_id(jsonData.get("update_id").getAsString());

		if (jsonData.get("certi_key") != null && !jsonData.get("certi_key").getAsString().equals(""))
			teacherVO.setCerti_key(jsonData.get("certi_key").getAsString());

		return teacherVO;
	}

	
	/**
	 * Json Data를 PasswordVO 로 변환한다. 
	 * @param jsonObject
	 * @return PasswordVO
	 * @throws Exception
	 */
	public PasswordVO passwordVOParser(JsonObject jsonData) throws Exception {
		PasswordVO passwordVO = new PasswordVO();
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			passwordVO.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("prev_pw") != null && !jsonData.get("prev_pw").getAsString().equals(""))
			passwordVO.setPrev_pw(jsonData.get("prev_pw").getAsString());

		if (jsonData.get("next_pw") != null && !jsonData.get("next_pw").getAsString().equals(""))
			passwordVO.setNext_pw(jsonData.get("next_pw").getAsString());

		return passwordVO;
	}

	
	/**
	 * Json Data를 QuizVO 로 변환한다. 
	 * @param jsonObject
	 * @return QuizVO
	 * @throws Exception
	 */
	public QuizVO quizVOParser(JsonObject jsonData) throws Exception {
		
		QuizVO quiz = new QuizVO();
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			quiz.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
			quiz.setQuiz_no(jsonData.get("quiz_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			quiz.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("sort_order") != null && !jsonData.get("sort_order").getAsString().equals(""))
			quiz.setSort_order(jsonData.get("sort_order").getAsInt());
		/**group no null일때 0으로 셋*/
		if (jsonData.get("group_no") != null && !jsonData.get("group_no").getAsString().equals(""))
			quiz.setGroup_no(jsonData.get("group_no").getAsInt());
		else
			quiz.setGroup_no(0);
		
		if (jsonData.get("quest") != null && !jsonData.get("quest").getAsString().equals(""))
			quiz.setQuest(jsonData.get("quest").getAsString());
		if (jsonData.get("quiz_mode_cd") != null && !jsonData.get("quiz_mode_cd").getAsString().equals(""))
			quiz.setQuiz_mode_cd(jsonData.get("quiz_mode_cd").getAsString());
		if (jsonData.get("quiz_detail") != null && !jsonData.get("quiz_detail").getAsString().equals(""))
			quiz.setQuiz_detail(jsonData.get("quiz_detail").getAsString());
		if (jsonData.get("clps_lang_cd") != null && !jsonData.get("clps_lang_cd").getAsString().equals(""))
			quiz.setClps_lang_cd(jsonData.get("clps_lang_cd").getAsString());
		if (jsonData.get("clps_no") != null && !jsonData.get("clps_no").getAsString().equals(""))
			quiz.setClps_no(jsonData.get("clps_no").getAsInt());
		if (jsonData.get("exam_tp_cd") != null && !jsonData.get("exam_tp_cd").getAsString().equals(""))
			quiz.setExam_tp_cd(jsonData.get("exam_tp_cd").getAsString());
		if (jsonData.get("expln") != null && !jsonData.get("expln").getAsString().equals(""))
			quiz.setExpln(jsonData.get("expln").getAsString());
//		if (jsonData.get("mquest_intent") != null && !jsonData.get("mquest_intent").getAsString().equals(""))
//			quiz.setMquest_intent(jsonData.get("mquest_intent").getAsString());
		if (jsonData.get("limit_tm") != null && !jsonData.get("limit_tm").getAsString().equals(""))
			quiz.setLimit_tm(jsonData.get("limit_tm").getAsString());

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			quiz.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			quiz.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			quiz.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			quiz.setUpdate_id(jsonData.get("update_id").getAsString());

		return quiz;
	}

	
	/**
	 * Json Data를 List<QuizExamVO> 로 변환한다. 
	 * 
	 * @param jsonObject
	 * @return List<QuizExamVO>
	 * @throws Exception
	 */
	public List<QuizExamVO> quizExamVOParser(JsonObject jsonData) throws Exception{
		List<QuizExamVO> quizExamList = new ArrayList<>();
		JsonArray jsonArray = jsonData.getAsJsonArray("quiz_exam");
		
		if(jsonData.getAsJsonArray("quiz_exam") == null) {
			return null;
		}
		
		int end = jsonArray.size();

		for(int i=0;i<end;i++) {
			QuizExamVO quizExam = new QuizExamVO();
			JsonObject jsonArrayData = (JsonObject) jsonArray.get(i);
			if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
				quizExam.setConts_no(jsonData.get("conts_no").getAsInt());
			if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
				quizExam.setQuiz_no(jsonData.get("quiz_no").getAsInt());
			if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
				quizExam.setMemb_id(jsonData.get("memb_id").getAsString());
			
			if (jsonArrayData.get("exam_no") != null && !jsonArrayData.get("exam_no").getAsString().equals(""))
				quizExam.setExam_no(jsonArrayData.get("exam_no").getAsInt());
			if (jsonArrayData.get("exam_detail") != null && !jsonArrayData.get("exam_detail").getAsString().equals(""))
				quizExam.setExam_detail(jsonArrayData.get("exam_detail").getAsString());
			if (jsonArrayData.get("ansok_yn") != null && !jsonArrayData.get("ansok_yn").getAsString().equals(""))
				quizExam.setAnsok_yn(jsonArrayData.get("ansok_yn").getAsString());
			if (jsonArrayData.get("subtest_ansok") != null && !jsonArrayData.get("subtest_ansok").getAsString().equals(""))
				quizExam.setSubtest_ansok(jsonArrayData.get("subtest_ansok").getAsString());
			if (jsonArrayData.get("accu_cd") != null && !jsonArrayData.get("accu_cd").getAsString().equals(""))
				quizExam.setAccu_cd(jsonArrayData.get("accu_cd").getAsString());
			
			if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
				quizExam.setRegist_dt(jsonData.get("regist_dt").getAsString());
			if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
				quizExam.setRegist_id(jsonData.get("regist_id").getAsString());
			if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
				quizExam.setUpdate_dt(jsonData.get("update_dt").getAsString());
			if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
				quizExam.setUpdate_id(jsonData.get("update_id").getAsString());
			quizExamList.add(quizExam);
		}
		return quizExamList;
	}
	
	
	/**
	 * Json Data를 QuizGroupVO 로 변환한다. 
	 * 
	 * @param jsonObject
	 * @return QuizGroupVO
	 * @throws Exception
	 */
	public QuizGroupVO quizGroupVOParser(JsonObject jsonData) throws Exception{
		QuizGroupVO quizGroup = new QuizGroupVO();
		if(jsonData.get("group_no") == null || jsonData.get("group_no").getAsString().equals("") || jsonData.get("group_no").getAsInt() == 1) {
			return null;
		}
		
		if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
			quizGroup.setConts_no(jsonData.get("conts_no").getAsInt());
		if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
			quizGroup.setQuiz_no(jsonData.get("quiz_no").getAsInt());
		if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
			quizGroup.setMemb_id(jsonData.get("memb_id").getAsString());
		if (jsonData.get("group_no") != null && !jsonData.get("group_no").getAsString().equals(""))
			quizGroup.setGroup_no(jsonData.get("group_no").getAsInt());
		if (jsonData.get("group_mode_cd") != null && !jsonData.get("group_mode_cd").getAsString().equals(""))
			quizGroup.setGroup_mode_cd(jsonData.get("group_mode_cd").getAsString());
		if (jsonData.get("group_pasge_detail") != null && !jsonData.get("group_pasge_detail").getAsString().equals(""))
			quizGroup.setGroup_pasge_detail(jsonData.get("group_pasge_detail").getAsString());
		if (jsonData.get("group_clps_no") != null && !jsonData.get("group_clps_no").getAsString().equals(""))
			quizGroup.setGroup_clps_no(jsonData.get("group_clps_no").getAsInt());
		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			quizGroup.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			quizGroup.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			quizGroup.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			quizGroup.setUpdate_id(jsonData.get("update_id").getAsString());
		
	
		return quizGroup;
	}
	
	
	/**
	 * Json Data를 List<QuizIntentVO> 로 변환한다. 
	 * 
	 * @param jsonObject
	 * @return List<QuizIntentVO>
	 * @throws Exception
	 */
	public List<QuizIntentVO> quizIntentVOParser(JsonObject jsonData) throws Exception{
		List<QuizIntentVO> quizIntentList = new ArrayList<>();
		
		if(jsonData.getAsJsonArray("quiz_intent") == null) {
			return null;
		}
		JsonArray jsonArray = jsonData.getAsJsonArray("quiz_intent");
		int end = jsonArray.size();
			
		for(int i=0;i<end;i++) {
			QuizIntentVO quizIntent = new QuizIntentVO();
			JsonObject jsonArrayData = (JsonObject) jsonArray.get(i);
			if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
				quizIntent.setConts_no(jsonData.get("conts_no").getAsInt());
			if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
				quizIntent.setQuiz_no(jsonData.get("quiz_no").getAsInt());
			if (jsonArrayData.get("mquest_intent_cd") != null && !jsonArrayData.get("mquest_intent_cd").getAsString().equals(""))
				quizIntent.setMquest_intent_cd(jsonArrayData.get("mquest_intent_cd").getAsString());
			if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
				quizIntent.setMemb_id(jsonData.get("memb_id").getAsString());
			if (jsonArrayData.get("mquest_intent") != null && !jsonArrayData.get("mquest_intent").getAsString().equals(""))
				quizIntent.setMquest_intent(jsonArrayData.get("mquest_intent").getAsString());
			if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
				quizIntent.setRegist_dt(jsonData.get("regist_dt").getAsString());
			if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
				quizIntent.setRegist_id(jsonData.get("regist_id").getAsString());
			if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
				quizIntent.setUpdate_dt(jsonData.get("update_dt").getAsString());
			if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
				quizIntent.setUpdate_id(jsonData.get("update_id").getAsString());
			quizIntentList.add(quizIntent);
			}
		
		return quizIntentList;
	}
	

	/**
	 * Json Data를 List<QuizTagVO> 로 변환한다.
	 *  
	 * @param jsonObject
	 * @return List<QuizTagVO>
	 * @throws Exception
	 */
	public List<QuizTagVO> quizTagVOParser(JsonObject jsonData) throws Exception{
		List<QuizTagVO> quizTagList = new ArrayList<>();
		if(jsonData.getAsJsonArray("quiz_tag") == null) {
			return null;
		}
		JsonArray jsonArray = jsonData.getAsJsonArray("quiz_tag");
		int end = jsonArray.size();
		for(int i=0;i<end;i++) {
			QuizTagVO quizTag = new QuizTagVO();
			JsonObject jsonArrayData = (JsonObject) jsonArray.get(i);
			
			if (jsonData.get("conts_no") != null && !jsonData.get("conts_no").getAsString().equals(""))
				quizTag.setConts_no(jsonData.get("conts_no").getAsInt());
			if (jsonData.get("quiz_no") != null && !jsonData.get("quiz_no").getAsString().equals(""))
				quizTag.setQuiz_no(jsonData.get("quiz_no").getAsInt());
			if (jsonData.get("memb_id") != null && !jsonData.get("memb_id").getAsString().equals(""))
				quizTag.setMemb_id(jsonData.get("memb_id").getAsString());

			if (jsonArrayData.get("tag_no") != null && !jsonArrayData.get("tag_no").getAsString().equals(""))
				quizTag.setTag_no(jsonArrayData.get("tag_no").getAsInt());
			if (jsonArrayData.get("tag") != null && !jsonArrayData.get("tag").getAsString().equals(""))
				quizTag.setTag(jsonArrayData.get("tag").getAsString());
			
			if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
				quizTag.setRegist_dt(jsonData.get("regist_dt").getAsString());
			if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
				quizTag.setRegist_id(jsonData.get("regist_id").getAsString());
			if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
				quizTag.setUpdate_dt(jsonData.get("update_dt").getAsString());
			if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
				quizTag.setUpdate_id(jsonData.get("update_id").getAsString());
			
			quizTagList.add(quizTag);
			}
		
		return quizTagList;
	}
	
	
	/**
	 * Json Data를 ComKeyVO 로 변환한다.
	 * 
	 * @param jsonData
	 * @return
	 * @throws Exception
	 */
	public ComKeyVO comKeyVOParser(JsonObject jsonData) throws Exception{
		ComKeyVO quizTag = new ComKeyVO();
		
		if (jsonData.get("serial_no") != null && !jsonData.get("serial_no").getAsString().equals(""))
			quizTag.setSerial_no(jsonData.get("serial_no").getAsInt());
		if (jsonData.get("confi_key") != null && !jsonData.get("confi_key").getAsString().equals(""))
			quizTag.setConfi_key(jsonData.get("confi_key").getAsString());
		if (jsonData.get("use_yn") != null && !jsonData.get("use_yn").getAsString().equals(""))
			quizTag.setUse_yn(jsonData.get("use_yn").getAsString());

		if (jsonData.get("regist_dt") != null && !jsonData.get("regist_dt").getAsString().equals(""))
			quizTag.setRegist_dt(jsonData.get("regist_dt").getAsString());
		if (jsonData.get("regist_id") != null && !jsonData.get("regist_id").getAsString().equals(""))
			quizTag.setRegist_id(jsonData.get("regist_id").getAsString());
		if (jsonData.get("update_dt") != null && !jsonData.get("update_dt").getAsString().equals(""))
			quizTag.setUpdate_dt(jsonData.get("update_dt").getAsString());
		if (jsonData.get("update_id") != null && !jsonData.get("update_id").getAsString().equals(""))
			quizTag.setUpdate_id(jsonData.get("update_id").getAsString());
		
		return quizTag;
	}
}
	