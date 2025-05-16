package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.demo.repo.FakeRepoInterface;

public class UserServiceTests {

    private FakeRepoInterface fakeRepo;
    private UserService userService;

    @BeforeEach
    public void setup() {
        fakeRepo = mock(FakeRepoInterface.class);
        userService = new UserServiceImpl(fakeRepo);
    }

    @Test
    public void testAddUser() {
        when(fakeRepo.insertUser(anyLong(), eq("Kagoentle"), eq("Maphatsoe"))).thenReturn("John");
        userService.addUser("Kagoentle", "Maphatsoe");
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq("Kagoentle"), eq("Maphatsoe"));
    }

    @Test
    public void testRemoveUser() {
        when(fakeRepo.deleteUser(2503130245022L)).thenReturn("Kagoentle");
        userService.removeUser(2503130245022L);
        verify(fakeRepo, times(1)).deleteUser(2503130245022L);
    }

    @Test
    public void testGetUser() {
        when(fakeRepo.findUserById(2503130245022L)).thenReturn("Kagoentle");
        userService.getUser(2503130245022L);
        verify(fakeRepo, times(1)).findUserById(2503130245022L);
    }
}
