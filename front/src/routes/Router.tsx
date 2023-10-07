import { createBrowserRouter } from "react-router-dom";
import { RoutePath } from "./RoutePath";
import { lazy } from "react";

const MainPage = lazy(() => import("src/pages/common/main"));
const ChatPage = lazy(() => import("src/pages/common/chat"));
const MyPage = lazy(() => import("src/pages/common/mypage"));
const ReportPage = lazy(() => import("src/pages/common/report"));

const LoginPage = lazy(() => import("src/pages/auth/login"));
const SignUpPage = lazy(() => import("src/pages/auth/signup"));

export const router = createBrowserRouter([
  {
    path: RoutePath.메인,
    children: [
      {
        index: true,
        element: <MainPage />,
      },
      {
        path: RoutePath.채팅,
        element: <ChatPage />,
      },
      {
        path: RoutePath.분석,
        element: <ReportPage />,
      },
      {
        path: RoutePath.내정보,
        element: <MyPage />,
      },
    ],
  },
  {
    path: RoutePath.로그인,
    children: [
      {
        index: true,
        element: <LoginPage />,
      },
      {
        path: RoutePath.회원가입,
        element: <SignUpPage />,
      },
    ],
  },
]);
