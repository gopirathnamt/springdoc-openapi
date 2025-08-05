package test.org.springdoc.api.v30.app207.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.org.springdoc.api.v30.app207.model.SysUser;

@RestController
@RequestMapping("/api/sysUser")
public class SysUserController extends SuperController<SysUser> {


}
