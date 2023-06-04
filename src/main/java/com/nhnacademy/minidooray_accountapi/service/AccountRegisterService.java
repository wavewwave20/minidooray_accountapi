package com.nhnacademy.minidooray_accountapi.service;


        import com.nhnacademy.minidooray_accountapi.dto.AccountRegisterDto;
        import com.nhnacademy.minidooray_accountapi.repository.AccountRepository;
        import lombok.Getter;
        import lombok.RequiredArgsConstructor;
        import lombok.Setter;
        import org.springframework.stereotype.Repository;
        import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountRegisterService {
    private final AccountRepository accountRepository;

    //#TODO: UUID처리가 필요합니다 Service단에서 생성할때 부여>?-기존 Task쪽 UUID도 생각해 봐야 할 듯 합니다.
    public AccountRegisterDto registerAccount(AccountRegisterDto accountRegisterDto) {
        accountRepository.save(accountRegisterDto);
    }


    public void deleteAccount(Long id) {
        accountRepository.deleteByUserId(id);
    }

    public AccountRegisterDto updateAccount(Long id, AccountRegisterDto accountRegisterDto) {
        accountRepository.findAccountByUserId(id);
    }
}
